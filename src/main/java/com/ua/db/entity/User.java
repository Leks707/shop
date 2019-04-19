package com.ua.db.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @autor Oleksii_Shylo
 */
@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    
    @NotNull(message = "first name can't be null")
    @Size(max = 65)
    @Column(name = "first_name")
    private String firstName;
    
    @NotNull(message = "last name can't be null")
    @Size(max = 65)
    @Column(name = "last_name")
    private String lastName;
    
    @NotNull
    @Column(name="password")
    private String password;
    
    @NotNull
    @Column(name="email", unique = true)
    private String email;
//    @Column(name="phone")
//    private int phoneNumber;
//    @Column(name="birthday")
//    private Date birthday;
//    @Enumerated(EnumType.STRING)
//    @Column(length = 15)
//    private Role role;
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_id")
//    private List<Order> orders;

}
