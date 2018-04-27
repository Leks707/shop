package com.ua.service;

import com.ua.db.entity.User;
import com.ua.dto.UserDto;
import com.ua.service.api.UserService;
import org.springframework.stereotype.Service;

/**
 * @autor Oleksii_Shylo
 */
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserRepository userRepository;

    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public boolean modify(User user) {
        return false;
    }

    @Override
    public UserDto getUserById(long id) {
        return null;
    }
}
