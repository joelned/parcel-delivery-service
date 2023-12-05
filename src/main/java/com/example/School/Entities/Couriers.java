package com.example.School.Entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Couriers {
    //Primary Key Sequence Generator
   @Id
    @GeneratedValue(
         strategy = GenerationType.IDENTITY
    )
    private int courierId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String vehicleNumber;


    public int getCourierId() {
        return courierId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    @OneToMany(mappedBy = "couriers")
    List<Parcel> parcel;

    @OneToMany(mappedBy = "couriers")
    List<Orders> orders;

    @ManyToOne
    @JoinColumn(name = "recipientId")
    private Recipient recipient;

}
