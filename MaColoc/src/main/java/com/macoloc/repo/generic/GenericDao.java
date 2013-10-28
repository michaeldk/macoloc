package com.macoloc.repo.generic;

import java.util.List;

/**
 * A generic DAO template providing an API for CUD operations.
 * 
 * @param <T>
 *            an entity type
 */
public interface GenericDao<T> {

    /**
     * Persist an entity.
     * 
     * @param element
     *            the entity to persist
     */
    public void create(T element);

    /**
     * Delete an entity.
     * 
     * @param element
     *            the entity to delete
     */
    void delete(T element);

    /**
     * Get all the entities.
     * 
     * @return a list containing all the entities
     */
    public List<T> findAll();

    /**
     * Get an entity matching an id.
     * 
     * @param id
     *            the id of the entity
     * @return the entity matching the id
     */
    public T findById(int id);

    /**
     * Update an entity.
     * 
     * @param element
     *            the entity to update
     */
    void update(T element);

}
