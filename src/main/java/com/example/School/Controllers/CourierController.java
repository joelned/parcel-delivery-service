package com.example.School.Controllers;
import com.example.School.Entities.Couriers;
import com.example.School.Services.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class CourierController {
    private final CourierService courierService;
    @Autowired
    public CourierController(CourierService courierService) {
        this.courierService = courierService;
    }
    @GetMapping("/getCourier")
    public String getCourier(Model model){
       Couriers courier = courierService.getCourier();
       model.addAttribute("courier", courier);
       return "courier";
    }
}
