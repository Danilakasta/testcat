package com.example.testcat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dog implements Animal {

    private Integer legsCount = 4;

    //TODO добавить метод который вернет имя на русском языке
    @Override
    public String
    say() {
        return "Гав";
    }

    @Override
    public Integer getLegsCount() {
        return legsCount;
    }
}
