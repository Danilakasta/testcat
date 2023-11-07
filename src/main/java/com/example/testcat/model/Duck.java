package com.example.testcat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
public class Duck extends AnimalAbstract {

    //Кол утинных ног
    private Integer duckLegsCount;

    //TODO 1.1 Добавить остальные отличные свойства уток

    @Override
    public String say() {
        return "Кря";
    }

}
