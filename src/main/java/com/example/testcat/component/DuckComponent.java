package com.example.testcat.component;

import com.example.testcat.model.Animal;
import com.example.testcat.model.Duck;
import org.springframework.stereotype.Component;

@Component
public class DuckComponent implements AnimalComponent{
    @Override
    public Animal getAnimal() {
        return new Duck();
    }

}
