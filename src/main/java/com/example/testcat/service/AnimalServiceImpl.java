package com.example.testcat.service;

import com.example.testcat.model.Animal;
import com.example.testcat.model.Dog;
import com.example.testcat.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Animal save(Dog animal) {
        animal = animalRepository.save(animal);

        return animal;
    }

    @Override
    public List<Dog> getAnimals() {
        return animalRepository.findAll();
    }
}