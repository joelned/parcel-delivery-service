package com.example.School.Services;

import com.example.School.Entities.Customer;
import com.example.School.Entities.Orders;
import com.example.School.Entities.Parcel;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.CustomerRepository;
import com.example.School.Repositories.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final ParcelRepository parcelRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository, OrdersRepository ordersRepository, OrdersService ordersService, ParcelRepository parcelRepository) {
        this.customerRepository = customerRepository;
        this.ordersRepository = ordersRepository;
        this.parcelRepository = parcelRepository;
    }
    @Autowired
    private final OrdersRepository ordersRepository;
    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
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
