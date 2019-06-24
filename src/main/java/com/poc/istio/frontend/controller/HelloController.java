package com.poc.istio.frontend.controller;

import java.util.HashMap;
import java.util.Map;

import com.poc.istio.frontend.client.UserClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloController
 */
@Controller
public class HelloController {

    @Autowired
    UserClient userClient;

    @Value("${my-data.value:NULL}")
    String myValue;

    @GetMapping(value = "/welcome")
    public String welcomePage(Model model) {
        Map<String,String> result = new HashMap<String,String>();
        String echo = userClient.get("echo 100");

        result.put("echo", echo);
        result.put("value", myValue);
        
        model.addAttribute("myData", result);
        return "hello";
    }
}