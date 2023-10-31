package com.example.testcat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Fish implements Animal{
    private Integer legsCount = 0;

    @Override
    public String say() {
        return null;
    }

    @Override
    public Integer getLegsCount() {
        return legsCount;
    }
}
