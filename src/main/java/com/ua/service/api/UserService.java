package com.ua.service.api;

import com.ua.db.entity.UserEntity;
import com.ua.dto.UserDto;

/**
 * @autor Oleksii_Shylo
 */
public interface UserService {

    /**
     * Creates a new user. Return true if user was created, otherwise - false
     *
     * @param user - user entity that will be created.
     * @return return true if user was created, otherwise - false
     */
    boolean create(UserEntity user);

    /**
     * Modifies existing user.
     *
     * @param user - user entity that will be modified.
     * @return return true if user was modified, otherwise - false
     */
    boolean modify(UserEntity user);

    /**
     *
     * @param id
     * @return
     */
    UserDto getUserById(long id);


}
