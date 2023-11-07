package com.example.testcat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Dog extends AnimalAbstract {

    private Integer legsCount;

    @Override
    public String
    say() {
        return "Гав";
    }

}
