package com.ua.validator;

import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class EmailValidator {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private Pattern pattern;
    private Matcher matcher;
    
    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }
    
    public boolean validate(String email) {
        matcher = pattern.matcher(EMAIL_PATTERN);
        return matcher.matches();
    }
}
