package com.macoloc.repo.generic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 * A generic DAO implementation providing CUD methods.
 * 
 * @param <T>
 *            an entity type
 */
public class GenericDaoImpl<T> implements GenericDao<T> {

    @PersistenceContext
    protected EntityManager entityManager;

    private Class<T> clazz;

    public GenericDaoImpl(final Class<T> clazz) {

        this.clazz = clazz;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void create(final T element) {

        this.entityManager.persist(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final T element) {

        this.entityManager.remove(element);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<T> findAll() {

        final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
        final CriteriaQuery<T> criteria = builder.createQuery(this.clazz);
        final Root<T> element = criteria.from(this.clazz);

        criteria.select(element);
        return this.entityManager.createQuery(criteria).getResultList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T findById(final int id) {

        return this.entityManager.find(this.clazz, id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final T element) {

        this.entityManager.merge(element);
    }
}
