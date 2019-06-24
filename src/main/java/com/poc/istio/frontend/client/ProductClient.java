package com.poc.istio.frontend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * PostClient
 */
@FeignClient(name = "product-api", url = "http://localhost:8080")
public interface ProductClient {
    
    @GetMapping("/products/{id}")
    String get(@PathVariable("id") String id);
    
}