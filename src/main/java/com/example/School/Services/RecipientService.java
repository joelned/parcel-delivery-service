package com.example.School.Services;


import com.example.School.Entities.Orders;
import com.example.School.Entities.Recipient;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipientService {

    private final RecipientRepository recipientRepository;
    private final OrdersService ordersService;
    private final OrdersRepository ordersRepository;


    @Autowired
    public RecipientService(RecipientRepository recipientRepository, OrdersService ordersService, OrdersRepository ordersRepository) {
        this.recipientRepository = recipientRepository;
        this.ordersService = ordersService;
        this.ordersRepository = ordersRepository;
    }



    public void saveRecipient(Recipient recipient){
        recipientRepository.save(recipient);
    }
}
