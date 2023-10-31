package com.example.testcat.service;

import com.example.testcat.controllers.AnimalController;
import com.example.testcat.controllers.TestController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CheckServiceImplTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getAllAnimals() {
        Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/animals/all",
                String.class)).contains("[{\"legsCount\":4},{\"legsCount\":2},{\"legsCount\":0}]");

    }

    @Test
    public void getAllCheck() {
        Assertions.assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/animals/check",
                String.class)).contains("[\" Животное - Dog(legsCount=4) ; издает - Гав ; кол-во ног - 4\",\" Животное - Duck(legsCount=2) ; издает - Кря ; кол-во ног - 2\",\" Животное - Fish(legsCount=0) ; издает - null ; кол-во ног - 0\"]");

    }
}