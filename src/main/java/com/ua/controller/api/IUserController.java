package com.ua.controller.api;

import com.ua.db.entity.User;
import com.ua.dto.UserDto;
import org.springframework.ui.Model;

import java.util.List;

/**
 * @autor Oleksii_Shylo
 */
public interface IUserController {

    /**
     *
     * @param userDto
     * @return
     */
    UserDto createUser(UserDto userDto);

    /**
     * Return existing user or null if user doesn't exist
     *
     * @param id - user identifier
     * @return existing user or null if user doesn't exist
     */
    User findUserById(long id, Model model);

    /**
     *
     * @return
     */
    List<UserDto> getUsers();
}
