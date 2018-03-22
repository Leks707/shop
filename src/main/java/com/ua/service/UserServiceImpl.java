package com.ua.service;

import com.ua.db.entity.UserEntity;
import com.ua.db.repository.api.UserRepository;
import com.ua.dto.UserDto;
import com.ua.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @autor Oleksii_Shylo
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserRepository userRepository;

    @Override
    public boolean create(UserEntity user) {
        return false;
    }

    @Override
    public boolean modify(UserEntity user) {
        return false;
    }

    @Override
    public UserDto getUserById(long id) {
        return null;
    }
}
