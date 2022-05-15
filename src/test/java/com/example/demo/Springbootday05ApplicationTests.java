package com.example.demo;

import com.example.demo.pojo.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbootday05ApplicationTests {

    @Autowired(required = false)
    Students students;
    @Test
    void contextLoads() {
        System.out.println(students);
    }

}
