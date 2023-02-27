package com.example.employeeManajment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SpringBootConfiguration
public class EmployeeManajmentApplication {

    public static void main(String[] args) {
       // Employee e = new Employee( "fawzi","dadifawzi11@gmail.com","technicien","Q2022","95183153","LinkedIn");
        SpringApplication.run(EmployeeManajmentApplication.class, args);
    }

}
