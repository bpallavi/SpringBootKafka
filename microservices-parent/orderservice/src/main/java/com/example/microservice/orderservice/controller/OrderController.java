package com.example.microservice.orderservice.controller;

/*
 @Author : Pallavi Banchare
 @email  : bancharepallavi033@gmail.com
 @date   : 01-03-2023
 @desc   :
*/

import com.example.microservice.orderservice.dto.OrderRequest;
import com.example.microservice.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void placeOrder(@RequestBody OrderRequest order) {
        orderService.placeOrder(order);
    }

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<ProductResponse> getAllProducts() {
//        return  productService.getAllProducts();
//    }
}


