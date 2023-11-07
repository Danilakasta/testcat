package com.example.testcat.model;

import jakarta.persistence.*;

@Entity(name="animal")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//TODO 6. Добавить клас человек,динозавр,растение, инопланетянил
// подумать будут ли они наслединками Animal и как все таки организовать наследование коректно
public class AnimalAbstract implements Animal  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", unique = true, nullable = false)
    private Long id;


    //TODO 1. добавить свойство которое будет хранить имя на русском языке

    //TODO 1.1 Добавить общие для всех животных свойства типо имени к примеру и тд.

    @Override
    public String say() {
        return null;
    }

}
