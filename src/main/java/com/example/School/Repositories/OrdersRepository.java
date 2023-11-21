package com.example.School.Repositories;
import com.example.School.Entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface OrdersRepository extends JpaRepository<Orders, Integer> {


}
