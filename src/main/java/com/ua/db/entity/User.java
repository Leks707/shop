package com.ua.db.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @autor Oleksii_Shylo
 */
@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Column(name = "first_name")
    private String firstName;
    @NotNull
    @Column(name = "last_name")
    private String lastName;
    @NotNull
    @Column(name="password")
    private String password;
    @NotNull
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private int phoneNumber;
    @Column(name="birthday")
    private Date birthday;
    @Enumerated(EnumType.STRING)
    @Column(length = 15)
    private Role role;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Order> orders;

}
