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
    @Override
    public String say() {
        return null;
    }

}
