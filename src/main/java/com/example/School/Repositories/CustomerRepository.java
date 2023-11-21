package com.example.School.Repositories;
import com.example.School.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
