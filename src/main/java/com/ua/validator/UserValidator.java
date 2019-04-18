package com.ua.validator;

import com.ua.db.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    private EmailValidator emailValidator;
    
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "empty.firstName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "empty.lastName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "empty.email");
        User user = (User) target;
        
        if (!emailValidator.validate(user.getEmail())) {
            errors.rejectValue("email", "invalid.format.email");
        }
    }
}
