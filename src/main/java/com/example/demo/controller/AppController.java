package com.example.demo.controller;

import lombok.var;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AppController {

    @GetMapping(value = "/")
    public HashMap<String, Object> home() {
        var map = new HashMap<String, Object>();

        map.put("version", "1.0");

        return map;
    }
}
