package com.example.School;

import com.example.School.Entities.Customer;
import com.example.School.Entities.Recipient;
import lombok.Data;

@Data
public class OrdersFormRequest {
    private Customer customer;
    private Recipient recipient;
}
