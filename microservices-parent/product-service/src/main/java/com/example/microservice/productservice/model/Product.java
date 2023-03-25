package com.example.microservice.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/*
 @Author : Pallavi Banchare
 @email  : bancharepallavi033@gmail.com
 @date   : 19-01-2023
 @desc   :
*/
@Document(value = "product")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Product {
 @Id
 String id;
 String name;
 String description;
 BigDecimal price;
}
