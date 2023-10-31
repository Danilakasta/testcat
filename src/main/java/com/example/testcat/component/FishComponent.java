package com.example.testcat.component;

import com.example.testcat.model.Animal;
import com.example.testcat.model.Fish;
import org.springframework.stereotype.Component;

@Component
public class FishComponent implements AnimalComponent {
    @Override
    public Animal getAnimal() {
        return new Fish();
    }
}
