package com.cy.cloud.interfaces;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface OrderService {

    @GetMapping("orders")
    String orders(@RequestParam("name") String name);

}