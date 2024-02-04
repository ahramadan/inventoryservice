package com.example.inventoryservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryService {

    @GetMapping("/inventory")
    public String inventory() {
        return "inventory Service !";
    }
}
