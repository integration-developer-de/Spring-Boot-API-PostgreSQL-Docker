package com.example.spring_boot_rest_postgree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_rest_postgree.models.Order;
import com.example.spring_boot_rest_postgree.service.OrderService;

@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/order")
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    @PostMapping("/api/v1/orders")
    public ResponseEntity<List<Order>> createOrders(@RequestBody List<Order> orders) {
        List<Order> createdOrders = orderService.createOrders(orders);
        return new ResponseEntity<>(createdOrders, HttpStatus.CREATED);
    }
}
