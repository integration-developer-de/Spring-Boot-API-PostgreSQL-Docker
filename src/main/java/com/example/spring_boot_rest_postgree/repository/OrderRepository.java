package com.example.spring_boot_rest_postgree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot_rest_postgree.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
    // Custom query methods can be defined here if needed
}