package com.poc.istio.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * HelloController
 */
@Controller
public class HelloController {

    // @Autowired
    // RestTemplate resttemplate;

    @GetMapping(value = "/welcome")
    public String welcomePage() {
        return "hello";
    }
}