package com.ua.convertor;

import com.ua.db.entity.User;
import com.ua.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class UserConvertor {

    @Autowired
    private ModelMapper modelMapper;

    public UserDto convertToDto(User user) {
        UserDto userDto = modelMapper.map(user, UserDto.class);
        return userDto;
    }

}
