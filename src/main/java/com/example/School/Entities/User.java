package com.example.School.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer userId;
    private String email;
    private String hashedPassword;
    private String name;

    @OneToMany(mappedBy = "user")
    List<Orders> orders;

    @OneToMany(mappedBy = "user")
    List<Customer>customers;



}
