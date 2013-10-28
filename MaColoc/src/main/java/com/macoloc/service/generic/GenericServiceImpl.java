package com.macoloc.service.generic;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.macoloc.form.generic.GenericForm;
import com.macoloc.repo.generic.GenericDao;

/**
 * A Generic service implementation providing default implementation for Create, Update, Delete and Display functions.
 * 
 * @param <T>
 *            an entity to manipulate
 * @param <F>
 *            the form allowing to validate the input
 */
@Transactional
public abstract class GenericServiceImpl<T, F extends GenericForm> implements GenericService<T, F> {

    protected GenericDao<T> dao;

    public GenericServiceImpl(final GenericDao<T> dao) {

        this.dao = dao;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void create(F form) throws Exception {
	    T entity = this.populateEntity(null, form);
	    this.dao.create(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final T element) {
        this.dao.delete(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteFromId(final int id) {
        this.dao.delete(this.dao.findById(id));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T findById(final int id) {
        return this.dao.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> list() {
        return this.dao.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final T element, final F form) {
        this.populateEntity(element, form);
        this.dao.update(element);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final T element) {
        this.dao.update(element);
    }

    /**
     * Populate an entity with a form content.
     * 
     * @param element
     *            the entity to populate
     * @param form
     *            the form containing the data
     */
    protected abstract T populateEntity(T entity, F form);

    /**
     * Populate a form with an entity content.
     * 
     * @param form
     *            the form to populate
     * 
     * @param element
     *            the entity containing the data
     */
    protected abstract void populateForm(F form, T element);
    
    /**
     * Verify all the business rules on that element
     * 
     * @param element the element to test against rules
     * @throws Exception
     */
    public abstract void verifyBusinessRules(T element) throws Exception;
}
