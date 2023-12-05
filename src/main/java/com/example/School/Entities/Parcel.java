package com.example.School.Entities;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table
@Data
public class Parcel {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer parcelId;
    private String parcelDescription;
    private String weight;
    private String size;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId")
    private Customer customer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "courierId")
    private Couriers couriers;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipientId")
    private Recipient recipient;




}
