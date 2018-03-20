package com.ua.controller.api;

import com.ua.dto.UserDto;

import java.util.List;

/**
 * @autor Oleksii_Shylo
 */
public interface UserController {

    /**
     *
     * @param userDto
     * @return
     */
    boolean createUser(UserDto userDto);

    /**
     * Return existing user or null if user doesn't exist
     *
     * @param id - user identifier
     * @return existing user or null if user doesn't exist
     */
    UserDto getUserById(long id);

    /**
     *
     * @return
     */
    List<UserDto> getUsers();
}
