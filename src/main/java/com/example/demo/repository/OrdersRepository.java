package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CustomersOrders;


@Repository
public interface OrdersRepository extends JpaRepository<CustomersOrders, Long> {

}
