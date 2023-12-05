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
    private Integer recipientId;
    private String pickUpLocation;
    private String deliveryLocation;
    private String phoneNumber;
    private String name;

    @OneToMany(mappedBy = "recipient")
    private List<Orders>orders;

    @OneToMany(mappedBy = "recipient")
    private List<Couriers> couriers;

    @OneToMany(mappedBy = "recipient")
    private List<Parcel>parcel;





}
