package com.example.microservice.orderservice.repository;

/*
 @Author : Pallavi Banchare
 @email  : bancharepallavi033@gmail.com
 @date   : 01-03-2023
 @desc   :
*/

import com.example.microservice.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
