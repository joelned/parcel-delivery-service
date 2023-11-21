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


    @ManyToOne
    @JoinColumn(name = "orderId")
   private Orders orders;


}
