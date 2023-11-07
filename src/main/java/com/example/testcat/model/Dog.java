package com.example.testcat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Dog extends AnimalAbstract {

    //Кол лап
    private Integer legsCount;

    //TODO 1.1 Добавить остальные отличные свойства собак

    @Override
    public String
    say() {
        return "Гав";
    }

}
