package com.cy.cloud.orderservice.impl;

import com.cy.cloud.interfaces.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService {

    @Override
    public String orders(String name) {
        return "orders: " + name;
    }
}
