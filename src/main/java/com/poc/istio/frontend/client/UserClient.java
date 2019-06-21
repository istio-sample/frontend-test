package com.poc.istio.frontend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * PostClient
 */
@FeignClient(name = "user-api", url = "http://user-api:8888")
public interface UserClient {
    
    @GetMapping("/posts/{id}")
    String get(@PathVariable("id") Long id);
    
}