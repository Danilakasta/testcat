package com.example.testcat.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Duck implements Animal {
    @Id
    @Column(name="id", unique = true, nullable = false)
    private Long id;

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
