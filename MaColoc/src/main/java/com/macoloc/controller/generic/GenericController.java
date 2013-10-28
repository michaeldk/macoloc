package com.macoloc.controller.generic;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.macoloc.form.generic.GenericForm;

/**
 * A Generic controller interface, providing an API for Create, Update, Delete and Display functions. It takes as type parameters a
 * JPA entity and a form.
 * 
 * @param <T>
 *            an entity to manipulate
 * 
 * @param <F>
 *            the form allowing to validate the input
 */
public interface GenericController<T, F extends GenericForm> {

    /**
     * Display the entity home page. Usually a page listing all the entities of the entity type.
     * 
     * @param model
     *            the context model
     * @return the entity home page path
     */
    @RequestMapping(method = RequestMethod.GET)
    public abstract String defaultHome(Model model, HttpSession session);

    /**
     * Display the details of a specific entity. Usually a page listing all the specific entity attributes values.
     * 
     * @param id
     *            the id of the entity to display
     * @param model
     *            the context model
     * @return the entity details page
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public abstract String display(@PathVariable
    int id, Model model, HttpSession session);

    /**
     * Display the entity creation page. Usually a page with input fields for each of this type of entity attributes.
     * 
     * @param model
     *            the context model
     * @return the entity creation page
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public abstract String displayCreate(Model model, HttpSession session);

    /**
     * Perform the creation action of a new entity. Usually it persists this entity in the DB.
     * 
     * @param form
     *            the input form with input validation
     * @param result
     *            the result of the form validation
     * @param model
     *            the context model
     * @return the entity home page
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public abstract String createAction(@Valid
    @ModelAttribute("createForm")
    F form, BindingResult result, Model model, HttpSession session);

    /**
     * Perform the application of the changes after an edit.
     * 
     * @param form
     *            the input form with input validation
     * @param result
     *            the result of the form validation
     * @param id
     *            the id of the entity to update
     * @param model
     *            the context model
     * @return the entity home page
     */
    @RequestMapping(value = {"/save", "/edit/save"}, method = RequestMethod.POST)
    public abstract String saveAction(@Valid
    @ModelAttribute("updateForm")
    F form, BindingResult result, @RequestParam(value = "id", required = true)
    int id, Model model, HttpSession session);

    /**
     * Display the entity edition page. Usually a page with input fields for each of this type of entity attributes, populated with
     * their current value.
     * 
     * @param model
     *            the context model
     * @param id
     *            the id of the entity to update
     * @return the entity edition page
     */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public abstract String displayEdit(@PathVariable
    	    int id, Model model, HttpSession session);
    
    /**
     * Display the entity edition page. Usually a page with input fields for each of this type of entity attributes, populated with
     * their current value.
     * 
     * @param model
     *            the context model
     * @param id
     *            the id of the entity to update
     * @return the entity edition page
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public abstract String displayEdit(Model model, @RequestParam(value = "id", required = true)
    int id, HttpSession session);

    /**
     * Perform the deletion action of a new entity. Usually it remove this entity from the DB.
     * 
     * @param id
     *            the id of the entity to delete
     * @param model
     *            the context model
     * @return the entity home page
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public abstract String deleteAction(Model model, @RequestParam(value = "id", required = true)
    int id, HttpSession session);
    
    /**
     * Perform the deletion action of a new entity. Usually it remove this entity from the DB.
     * 
     * @param id
     *            the id of the entity to delete
     * @param model
     *            the context model
     * @return the entity home page
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public abstract String deleteAction(@PathVariable
    	    int id, Model model, HttpSession session);

}
