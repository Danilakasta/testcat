package com.example.testcat.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "Animal")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dog implements Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", unique = true, nullable = false)
    private Long id;

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
