package com.example.School.Entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Customer {

    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE
)


    private Integer customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;




}
