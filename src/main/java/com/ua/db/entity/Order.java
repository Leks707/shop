package com.ua.db.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue
    private long id;
    @NotNull
    @Column(name = "first_name")
    private Date orderDate;

}
