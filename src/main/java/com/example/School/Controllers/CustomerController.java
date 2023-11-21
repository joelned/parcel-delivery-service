package com.example.School.Controllers;
import com.example.School.Entities.Customer;
import com.example.School.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping("/createCustomer")
    public String saveCustomer(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/recipient";
    }
    @DeleteMapping("/deleteCustomer/{customerId}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable("customerId") Integer customerId){
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<>("Your information has been deleted", HttpStatus.OK);
    }
}
