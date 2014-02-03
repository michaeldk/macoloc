package com.macoloc.controller.generic;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.macoloc.controller.util.DateEditor;
import com.macoloc.form.generic.GenericForm;
import com.macoloc.service.generic.GenericService;

/**
 * A Generic controller implementation, providing default implementation for Create, Update, Delete and Display functions.
 * 
 * @param <T>
 *            an entity to manipulate
 * @param <F>
 *            the form allowing to validate the input
 */
public abstract class GenericControllerImpl<T, F extends GenericForm> implements GenericController<T, F> {

    protected String name;

    protected String root;

    protected GenericService<T, F> service;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateEditor());
    }
    
    public GenericControllerImpl(final String root, final String name, final GenericService<T, F> service) {
        this.root = root;
        this.name = name;
        this.service = service;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(method = RequestMethod.GET)
    public String defaultHome(final Model model, HttpSession session) {
        this.loadEntities(model);
        this.populateLists(model);
        return this.root;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String display(@PathVariable
    final int id, final Model model, HttpSession session) {
        this.loadEntityContext(model, id);
        return "display/" + this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String displayCreate(final Model model, HttpSession session) {
        this.loadCreateContext(model);
        this.populateLists(model);

        return "create/" + this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createAction(@Valid
    @ModelAttribute("createForm")
    final F form, final BindingResult result, final Model model, HttpSession session) {

        try {
            if (!result.hasErrors()) {
                this.service.create(form);
                return "redirect:/" + this.root + '/';
            } else {
                this.populateLists(model);
                return "create/" + this.name;
            }
        } catch (final Exception exception) {
            this.populateLists(model);
            this.loadErrorContext(model, exception);
            return "create/" + this.name;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = {"/save", "/edit/save"}, method = RequestMethod.POST)
    public String saveAction(@Valid
    @ModelAttribute("updateForm")
    final F form, final BindingResult result, @RequestParam(value = "id", required = true)
    final int id, final Model model, HttpSession session) {

        try {
            if (!result.hasErrors()) {
                final T entity = this.service.findById(id);
                this.service.update(entity, form);
                return "redirect:/" + this.root + '/';
            } else {
                this.loadEntity(model, id);
                this.populateLists(model);
                return "edit/" + this.name;
            }
        } catch (final Exception exception) {
            this.loadEntity(model, id);
            this.populateLists(model);
            this.loadErrorContext(model, exception);
            return "edit/" + this.name;
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String displayEdit(@PathVariable
    	    int id, Model model, HttpSession session) {

        this.loadEntity(model, id);
        this.loadEditContext(model, id);
        this.populateLists(model);
        return "edit/" + this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String displayEdit(final Model model, @RequestParam(value = "id", required = true)
    final int id, HttpSession session) {

        this.loadEntity(model, id);
        this.loadEditContext(model, id);
        this.populateLists(model);
        return "edit/" + this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteAction(final Model model, @RequestParam(value = "id", required = true)
    final int id, HttpSession session) {

        try {
            this.service.deleteFromId(id);
            return "redirect:/" + this.root + '/';
        } catch (final Exception exception) {
            this.loadErrorContext(model, exception);
            return this.root;
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteAction(@PathVariable
    	    int id, Model model, HttpSession session) {

        try {
            this.service.deleteFromId(id);
            return "redirect:/" + this.root + '/';
        } catch (final Exception exception) {
            this.loadErrorContext(model, exception);
            return this.root;
        }
    }

    /**
     * Load the exception context into the context model. By default, it loads the exception message.
     * 
     * @param model
     *            the context model
     * @param exception
     *            the exception
     */
    protected void loadErrorContext(final Model model, final Exception exception) {
        model.addAttribute("exception", exception.getMessage());
    }

    /**
     * Load the create context into the context model. By default, it loads an empty creation form
     * 
     * @param model
     *            the context model
     */
    protected void loadCreateContext(final Model model) {
        model.addAttribute("createForm", this.service.createForm());
    }

    /**
     * Load the update context into the context model. By default, it loads an empty creation form
     * 
     * @param model
     *            the context model
     */
    protected void loadEditContext(final Model model, final int id) {
        model.addAttribute("updateForm", this.service.createForm());
    }

    /**
     * Load all the entities of the entity type handled by the controller into the context model.
     * 
     * @param model
     *            the context model
     */
    protected void loadEntities(final Model model) {

        model.addAttribute("list", this.service.list());
    }

    /**
     * Load a specific entity into the context model.
     * 
     * @param model
     *            the context model
     * @param id
     *            the id of the entity to load
     */
    protected void loadEntity(final Model model, final int id) {
        model.addAttribute("item", this.service.findById(id));
    }

    /**
     * Load a specific entity context into the context model. By default it loads only the entity but for some entities, some other
     * entities might be useful.
     * 
     * @param model
     *            the context model
     * @param id
     *            the id of the entity to load
     */
    protected void loadEntityContext(final Model model, final int id) {

        this.loadEntity(model, id);
    }

    /**
     * Populate the lists of the other entities referenced by the current entity.
     * 
     * @param model
     *            the context model
     */
    protected abstract void populateLists(Model model);
}
