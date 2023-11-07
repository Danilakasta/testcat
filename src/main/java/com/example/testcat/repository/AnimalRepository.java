package com.example.testcat.repository;

import com.example.testcat.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Dog,Long> {
}
