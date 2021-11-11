package com.nickmcconnell.springpoc;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void drive(){
        System.out.println("The car is driving...");
    }
}
