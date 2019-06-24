package com.poc.istio.frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductsController
 */
@RestController
public class ProductsController {

    @GetMapping("/products/{id}")
    public String get(@PathVariable String id){
        return "Products ID: "+ id;
    }
    
}