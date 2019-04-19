package com.ua.service;

import com.ua.db.entity.User;
import com.ua.db.repository.api.UserRepository;
import com.ua.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @autor Oleksii_Shylo
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User modify(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserById(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.isPresent() ? userOptional.get() : null;
    }
}
