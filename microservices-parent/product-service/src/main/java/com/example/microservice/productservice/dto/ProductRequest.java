package com.example.microservice.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/*
 @Author : Pallavi Banchare
 @email  : bancharepallavi033@gmail.com
 @date   : 19-01-2023
 @desc   :
*/
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class ProductRequest {
    String name;
    String description;
    BigDecimal price;
}
