package com.example.School.Services;

import com.example.School.Entities.Customer;
import com.example.School.Entities.Orders;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

    private final Orders orders;
    private final CustomerRepository customerRepository;
    private final OrdersService ordersService;
    @Autowired
    public CustomerService(Orders orders, CustomerRepository customerRepository, OrdersRepository ordersRepository, OrdersService ordersService) {
        this.orders = orders;
        this.customerRepository = customerRepository;
        this.ordersRepository = ordersRepository;
        this.ordersService = ordersService;
    }
    @Autowired
    private final OrdersRepository ordersRepository;
    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
        orders.setCustomer(customer);
        ordersRepository.save(orders);
    }
    public String customerNotFound(){
        return "Customer was not found";
    }

    public void deleteCustomer(Integer customerId){
       Optional<Customer> customerToBeDeleted =  customerRepository.findById(customerId);
       if(customerToBeDeleted.isPresent()){
           customerRepository.deleteById(customerId);
       }
       else{
           customerNotFound();
       }

    }






}
