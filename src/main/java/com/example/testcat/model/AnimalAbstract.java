package com.example.testcat.model;

import jakarta.persistence.*;

@Entity(name="animal")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class AnimalAbstract implements Animal  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", unique = true, nullable = false)
    private Long id;

    //TODO добавить метод который вернет имя на русском языке

    @Override
    public String say() {
        return null;
    }

}
