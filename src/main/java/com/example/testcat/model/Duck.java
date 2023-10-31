package com.example.testcat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Duck implements Animal {

    private Integer legsCount = 2;

    @Override
    public String say() {
        return "Кря";
    }

    @Override
    public Integer getLegsCount() {
        return legsCount;
    }
}
