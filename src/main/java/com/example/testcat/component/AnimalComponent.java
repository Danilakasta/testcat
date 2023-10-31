package com.example.testcat.component;

import com.example.testcat.model.Animal;

public interface AnimalComponent {

    Animal getAnimal();

    default boolean checkSay() {
        return getAnimal().say() == null;
    }

    default String say() {
        return getAnimal().say();
    }

    default Integer getLegsCount() {
        return getAnimal().getLegsCount();
    }
}
