package com.ua.service;

import com.ua.db.entity.User;
import com.ua.db.repository.api.IUserRepository;
import com.ua.service.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @autor Oleksii_Shylo
 */
@Service
public class UserService implements IUserService<User> {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean modify(User user) {
        return false;
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        userRepository.delete(id);
    }
}
