package com.codetime.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    public static final String PAYMENT_URL = "http://cloud-provider01";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/ip")
    public String getInfo() {
        return restTemplate.getForObject(PAYMENT_URL + "/api/ip", String.class);
    }
}
