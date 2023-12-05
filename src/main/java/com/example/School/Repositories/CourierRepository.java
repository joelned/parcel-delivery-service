package com.example.School.Repositories;

import com.example.School.Entities.Couriers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourierRepository extends JpaRepository<Couriers, Integer> {
    List<Couriers> findAll();


}
