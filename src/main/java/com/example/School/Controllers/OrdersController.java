package com.example.School.Controllers;
import com.example.School.Entities.Orders;
import com.example.School.Services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(path = "api/order")
public class OrdersController {
    @Autowired
    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
    @PostMapping("/saveOrder")
    public ResponseEntity<Object> saveOrder(@ModelAttribute Orders order){
        ordersService.createOrders(order);
        return new ResponseEntity<>("Order Created", HttpStatus.CREATED);
    }
    @GetMapping("/getOrder/{orderId}")
    public ResponseEntity<Object>getOrderById(@PathVariable("orderId") Integer orderId){
        ordersService.getOrderById(orderId);
        return new ResponseEntity<>("Your Order has been successfully created", HttpStatus.OK);
    }
    @DeleteMapping("/deleteOrder/{orderId}")
    public ResponseEntity<Object>deleteOrder(@PathVariable("orderId") Integer orderId){
        ordersService.deleteOrders(orderId);
        return new ResponseEntity<>("The Order has been deleted", HttpStatus.OK);
    }
}
