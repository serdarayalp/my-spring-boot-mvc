package de.mydomain.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping("/name")
    public String getName(@RequestParam(value = "name", defaultValue = "<No Name>") String name) {
        return String.format("Hello %s!", name);
    }
}