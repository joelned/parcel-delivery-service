package com.example.School.Entities;
import com.example.School.Repositories.CustomerRepository;
import com.example.School.Repositories.ParcelRepository;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table
@Data
public class Customer {

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
)
    private Integer customerId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

    @OneToMany(mappedBy = "customer")
    private List<Parcel> parcel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private User user;
}
