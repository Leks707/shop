package com.ua.controller;

import com.ua.controller.api.IUserController;
import com.ua.dto.UserDto;
import com.ua.db.entity.User;
import com.ua.service.api.IUserService;
import com.ua.validator.UserValidator;
import io.swagger.annotations.Api;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
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
 * Controller that provides methods for dealing with users.
 *
 * @autor Oleksii_Shylo
 */
@RestController
@RequestMapping("/user")
@Api(value = "/user", description = "Provides methods for dealing with users")
public class UserController implements IUserController {

    private static final Logger LOGGER = LogManager.getLogger(UserController.class);

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private IUserService userService;

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserDto createUser(@RequestBody UserDto userDto) {
//        User userEntity = new User();
//        userEntity.setFirstName(userDto.getFirstName());
//        userEntity.setLastName(userDto.getLastName());
//        return userService.create(userEntity);
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public User findUserById(@PathVariable("id") long id, Model model) {
        LOGGER.debug("find user by id: " + id);
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        if (user == null) {
            model.addAttribute("message", "User not found");
        }
        return user;
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
