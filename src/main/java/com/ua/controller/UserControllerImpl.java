package com.ua.controller;

import com.ua.controller.api.UserController;
import com.ua.dto.UserDto;
import com.ua.db.entity.UserEntity;
import com.ua.service.api.UserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @autor Oleksii_Shylo
 */
@RestController
@RequestMapping("/user")
public class UserControllerImpl implements UserController {

    private static final Logger LOGGER = LogManager.getLogger(UserControllerImpl.class);

    @Autowired
    private UserService userService;

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public boolean createUser(@RequestBody UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        return userService.create(userEntity);
    }

    @Override
    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable("id") long id) {
        return userService.getUserById(id);
    }

    @Override
    @GetMapping(value = "/get",
//            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public @ResponseBody List<UserDto> getUsers() {
        LOGGER.debug("Get all users");
        LOGGER.error("Get all users");
        List<UserDto> users = new ArrayList<>();
        UserDto userDto = new UserDto();
        userDto.setFirstName("First");
        userDto.setLastName("Last");
        userDto.setAge(12);
        userDto.setPassword("pass");

        UserDto userDto2 = new UserDto();
        userDto2.setFirstName("First2");
        userDto2.setLastName("Last2");
        userDto2.setAge(12);
        userDto2.setPassword("pass2");
        users.add(userDto);
        users.add(userDto2);
        LOGGER.debug("users: " + users);
        return users;
    }
}
