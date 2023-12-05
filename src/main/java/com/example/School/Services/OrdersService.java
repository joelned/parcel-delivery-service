package com.example.School.Services;
import com.example.School.Entities.Orders;
import com.example.School.Entities.Parcel;
import com.example.School.Repositories.OrdersRepository;
import com.example.School.Repositories.ParcelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
@Service
public class OrdersService {
Random random = new Random();
    @Autowired
    private final OrdersRepository ordersRepository;

    private final ParcelRepository parcelRepository;
    public OrdersService(OrdersRepository parcelRepository, ParcelRepository parcelRepository1) {
        this.ordersRepository = parcelRepository;

        this.parcelRepository = parcelRepository1;
    }

    private List<Orders> orders = new ArrayList<>();
    public void createOrders(Orders order) {
        ordersRepository.save(order);
    }
    public Orders getOrderById(Integer orderId) {
    List<Orders> orders = ordersRepository.findAll();
        Optional<Orders> ordersOptional = ordersRepository.findById(orderId);
    if(ordersOptional.isEmpty()){
        return null;
    }
    else{
       return orders.get(orderId);
    }}
    public void deleteOrders(Integer orderId) {
        ordersRepository.deleteById(orderId);
    }

    public Orders getOrder() {
        return new Orders();

    }
}

