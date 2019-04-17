package com.ua.service.api;

import com.ua.db.entity.User;
import org.springframework.ui.Model;

/**
 * @autor Oleksii_Shylo
 */
public interface IUserService {

    /**
     * Creates a new user. Return true if user was created, otherwise - false
     *
     * @param user - user entity that will be created.
     * @return the saved user
     */
    User create(User user);

    /**
     * Modifies existing user.
     *
     * @param user - user entity that will be modified.
     * @return the modified user
     */
    User modify(User user);

    /**
     *
     * @param id
     * @return
     */
    User findUserById(long id);


}
