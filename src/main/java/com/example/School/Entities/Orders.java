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

  @ManyToOne
  @JoinColumn(name = "customerId")
    private Customer customer;

  @ManyToOne
  @JoinColumn(name = "deliveryDetailsId")
  private Recipient recipient;

  @OneToMany(mappedBy = "orders")
    private List<Parcel>parcels;


}
