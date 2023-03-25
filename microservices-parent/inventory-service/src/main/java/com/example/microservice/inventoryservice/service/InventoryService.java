package com.example.microservice.inventoryservice.service;

import com.example.microservice.inventoryservice.dto.InventoryResponse;
import com.example.microservice.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    @SneakyThrows
    public List<InventoryResponse> isInStock(List<String> sku_code) {
        log.info("Checking Inventory");
        return inventoryRepository.findBySkuCodeIn(sku_code).stream()
                .map(inventory ->
                        InventoryResponse.builder()
                                .sku_code(inventory.getSku_code())
                                .isInStock(inventory.getQuantity() > 0)
                                .build()
                ).collect(Collectors.toList());
    }
}