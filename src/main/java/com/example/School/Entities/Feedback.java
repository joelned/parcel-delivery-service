package com.example.School.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Feedback{
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int feedBackId;
    private int rating;
    private String comment;
    private String userName;
}

