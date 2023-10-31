package com.example.testcat.service;

import com.example.testcat.model.Animal;

import java.util.List;

public interface CheckService {
    List<Animal> getAllAnimals();

    List<String> check();
}
