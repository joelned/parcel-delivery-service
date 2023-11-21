package com.example.School.Services;

import com.example.School.Entities.Customer;
import com.example.School.Entities.Orders;
import com.example.School.Entities.Recipient;
import com.example.School.Repositories.CustomerRepository;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.RecipientRepository;
import org.springframework.stereotype.Service;

@Service
public class SaveCustomerAndRecipientService{
    private final CustomerRepository customerRepository;
    private final RecipientRepository recipientRepository;
    private final OrdersRepository ordersRepository;


    public SaveCustomerAndRecipientService(CustomerRepository customerRepository, RecipientRepository recipientRepository,
                                           OrdersRepository ordersRepository) {
        this.customerRepository = customerRepository;
        this.recipientRepository = recipientRepository;
        this.ordersRepository = ordersRepository;
    }

    public void saveCustomerAndRecipient(Customer customer, Recipient recipient){
        customerRepository.save(customer);

        recipientRepository.save(recipient);

        Orders orders = new Orders();

        orders.setRecipient(recipient);

        orders.setCustomer(customer);

        ordersRepository.save(orders);
    }
}
