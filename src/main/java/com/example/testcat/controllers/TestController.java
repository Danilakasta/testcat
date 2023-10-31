package com.example.testcat.controllers;

import com.example.testcat.model.Animal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("test")
    private String getAllAnimals() {

        return "Hello, World";
    }
}
