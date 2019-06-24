package com.poc.istio.frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsersController
 */
@RestController
public class UsersController {

    @GetMapping("/users/{echo}")
    public String get(@PathVariable String echo){
        return "Hello "+echo;
    }
    
}