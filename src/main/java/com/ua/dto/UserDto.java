package com.ua.dto;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @autor Oleksii_Shylo
 */
@Data
public class UserDto {

    @NotNull
    @Size(min = 2, max = 20)
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    @Size(min = 10, max = 20)
    private String password;
    @NotNull
    private String confirmPassword;
    @NotNull
    private String email;
    private int phoneNumber;
    @NotNull
    private Date birthDay;
    @NotNull
    private String role;
    @NotNull
    @Min(16)
    @Max(120)
    private int age;
}
