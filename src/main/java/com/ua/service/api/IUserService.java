package com.ua.service.api;

import com.ua.db.entity.User;

/**
 * @autor Oleksii_Shylo
 */
public interface IUserService<S extends User> {

    /**
     * Creates a new user. Return true if user was created, otherwise - false
     *
     * @param user - user entity that will be created.
     * @return return true if user was created, otherwise - false
     */
    S create(User user);

    /**
     * Modifies existing user.
     *
     * @param user - user entity that will be modified.
     * @return return true if user was modified, otherwise - false
     */
    boolean modify(User user);

    /**
     *
     * @param id
     * @return
     */
    User getUserById(long id);

    /**
     *
     * @param id
     */
    void delete(long id);

}
