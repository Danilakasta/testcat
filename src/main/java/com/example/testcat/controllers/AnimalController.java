package com.example.testcat.controllers;


import com.example.testcat.model.Animal;
import com.example.testcat.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {

    private final CheckService checkService;

    @Autowired
    public AnimalController(CheckService checkService) {
        this.checkService = checkService;
    }

    @GetMapping("all")
    public List<Animal> getAllAnimals() {

        return checkService.getAllAnimals();
    }

    @GetMapping("check")
    public List<String> checkSay() {

        return checkService.check();
    }
}
