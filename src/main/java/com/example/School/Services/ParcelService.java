package com.example.School.Services;
import com.example.School.Entities.Couriers;
import com.example.School.Entities.Customer;
import com.example.School.Entities.Parcel;
import com.example.School.Entities.Orders;
import com.example.School.Repositories.CourierRepository;
import com.example.School.Repositories.CustomerRepository;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class ParcelService {

    private final ParcelRepository parcelRepository;



    @Autowired
    public ParcelService(ParcelRepository parcelRepository, OrdersRepository ordersRepository, CourierRepository courierRepository) {
        this.parcelRepository = parcelRepository;

    }

    public void createParcel(Parcel parcel) {
         parcelRepository.save(parcel);
    }

    public void deleteParcel(Integer parcelId) {
         parcelRepository.deleteById(parcelId);
    }
}
