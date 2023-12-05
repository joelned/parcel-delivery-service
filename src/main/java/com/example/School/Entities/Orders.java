package com.example.School.Entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Orders {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer orderId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "customerId")
    private Customer customer;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "recipientId")
  private Recipient recipient;


  @OneToMany(mappedBy = "orders")
    private List<Parcel>parcels;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "userId")
    private User user;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "courierId")
    private Couriers couriers;




}
