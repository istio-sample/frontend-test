package com.poc.istio.frontend.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * PostClient
 */
@FeignClient(name = "user-api", url = "http://localhost:8080")
public interface UserClient {
    
    @GetMapping("/users/{echo}")
    String get(@PathVariable("echo") String echo);
    
}