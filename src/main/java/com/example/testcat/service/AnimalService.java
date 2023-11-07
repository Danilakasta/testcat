package com.example.testcat.service;

import com.example.testcat.model.Animal;
import com.example.testcat.model.AnimalAbstract;
import com.example.testcat.model.Dog;

import java.util.List;

public interface AnimalService {
    Animal save(AnimalAbstract animal);

    List<AnimalAbstract> getAnimals();
}
