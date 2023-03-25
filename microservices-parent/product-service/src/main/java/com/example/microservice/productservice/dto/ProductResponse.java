package com.example.microservice.productservice.dto;

/*
 @Author : Pallavi Banchare
 @date   : 19-01-2023
 @desc   :
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductResponse {
    String id;
    String name;
    String description;
    BigDecimal price;
}
