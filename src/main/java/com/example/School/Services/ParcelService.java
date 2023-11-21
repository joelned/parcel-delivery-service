package com.example.School.Services;
import com.example.School.Entities.Parcel;
import com.example.School.Entities.Orders;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class ParcelService {
    Random random = new Random();
    private final ParcelRepository parcelRepository;
    private final OrdersRepository ordersRepository;
    private final Orders orders;

    @Autowired
    public ParcelService(ParcelRepository parcelRepository, OrdersRepository ordersRepository, Orders orders) {
        this.parcelRepository = parcelRepository;
         this.ordersRepository = ordersRepository;

        this.orders = orders;
    }

    public void createParcel(Parcel parcel) {
        parcel.setOrders(orders);
         parcelRepository.save(parcel);
    }

    public void deleteParcel(Integer parcelId) {
         parcelRepository.deleteById(parcelId);
    }
}
