package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootday05Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootday05Application.class, args);
        System.out.println(SpringBootVersion.getVersion());
    }

}
