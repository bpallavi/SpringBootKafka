package com.example.microservice.productservice.service;

import com.example.microservice.productservice.dto.ProductRequest;
import com.example.microservice.productservice.dto.ProductResponse;
import com.example.microservice.productservice.model.Product;
import com.example.microservice.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/*
 @Author : Pallavi Banchare
 @date   : 19-01-2023
 @desc   :
*/

@Service
@Slf4j

public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public  void createProduct(ProductRequest productRequest) {
        Product product = Product.builder().name(productRequest.getName()).
                description(productRequest.getDescription()).price(productRequest.getPrice()).build();

        productRepository.save(product);
        log.info("Product {} is saved",product.getId());
    }

    public List<ProductResponse> getAllProducts() {

        List<Product> products = productRepository.findAll();

        return products.stream().map(this::mapToProductResponse).collect(Collectors.toList());


    }

    public ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder().name(product.getName()).id(product.getId())
                .description(product.getDescription()).price(product.getPrice()).build();
    }
}
