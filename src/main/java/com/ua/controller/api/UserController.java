package com.ua.controller.api;

import com.ua.dto.UserDto;

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
}
