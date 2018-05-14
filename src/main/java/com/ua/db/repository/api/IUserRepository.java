package com.ua.db.repository.api;

import com.ua.db.entity.User;
/**
 * @autor Oleksii_Shylo
 */
public interface IUserRepository<S extends User>{

    /**
     * Saves a given entity. Use the returned instance for further operations as the save operation might have changed the
     * entity instance completely.
     *
     * @param entity
     * @return the saved entity
     */
    S save(S entity);

    /**
     * Retrieves an entity by its id.
     *
     */
    S findOne(long id);

    /**
     * Deletes the entity with the given id.
     *
     * @param id must not be {@literal null}.
     * @throws IllegalArgumentException in case the given {@code id} is {@literal null}
     */
    void delete(long id);

}
