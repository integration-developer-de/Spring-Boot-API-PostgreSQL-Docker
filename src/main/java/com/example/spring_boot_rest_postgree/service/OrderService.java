package com.example.spring_boot_rest_postgree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_rest_postgree.models.Order;
import com.example.spring_boot_rest_postgree.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> createOrders(List<Order> orders) {
        return orderRepository.saveAll(orders);
    }
}
