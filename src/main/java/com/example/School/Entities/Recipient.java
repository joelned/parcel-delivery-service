package com.example.School.Entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.ListResourceBundle;

@Entity
@Table
@Data
public class Recipient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer deliveryDetailsId;
    private String pickUpLocation;
    private String deliveryLocation;
    private String phoneNumber;
    private String name;

    @OneToMany(mappedBy = "recipient")
    private List<Orders>orders;

}
