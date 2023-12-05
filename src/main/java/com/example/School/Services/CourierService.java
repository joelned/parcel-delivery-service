package com.example.School.Services;

import com.example.School.Entities.Couriers;
import com.example.School.Repositories.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourierService {


    @Autowired
    private final CourierRepository courierRepository;


    ArrayList<Couriers> couriers = new ArrayList<>();

    public CourierService(CourierRepository courierRepository) {
        this.courierRepository = courierRepository;
    }

    public  Couriers getCourier() {
     List<Couriers> courier = courierRepository.findAll();

     if(courier.isEmpty()){
         return null;
     }
     Random random = new Random();
     int randomIndex = random.nextInt(courier.size());

     return courier.get(randomIndex);

    }






}
