package com.example.School.Entities;

import jakarta.persistence.*;
import lombok.Data;

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

}
