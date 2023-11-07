package com.example.testcat.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
public class Duck extends AnimalAbstract {

    //Кол утинныз ног
    private Integer duckLegsCount;

    @Override
    public String say() {
        return "Кря";
    }

}
