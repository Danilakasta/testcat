package com.example.testcat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
public class Fish extends AnimalAbstract{

    //Кол плавников
    private Integer finCount;

    //TODO 1.1 Добавить остальные отличные свойства рыб

    @Override
    public String say() {
        return null;
    }

}
