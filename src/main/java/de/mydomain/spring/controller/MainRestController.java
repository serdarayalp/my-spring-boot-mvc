package de.mydomain.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping("/name")
    public String getName(@RequestParam(value = "name", defaultValue = "Max") String name) {
        return String.format("Hello %s!", name);
    }
}
