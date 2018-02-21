package com.ua.service;

import com.ua.db.entity.UserEntity;
import com.ua.service.api.UserService;
import org.springframework.stereotype.Service;

/**
 * @autor Oleksii_Shylo
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean create(UserEntity user) {
        return false;
    }

    @Override
    public boolean modify(UserEntity user) {
        return false;
    }
}
