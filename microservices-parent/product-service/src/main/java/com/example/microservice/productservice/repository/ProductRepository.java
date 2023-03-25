package com.example.microservice.productservice.repository;

import com.example.microservice.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/*
 @Author : Pallavi Banchare
 @email  : bancharepallavi033@gmail.com
 @date   : 19-01-2023
 @desc   :
*/
public interface ProductRepository extends MongoRepository<Product,String> {
}
