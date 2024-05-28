package com.spring.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends Animal{
    String color = "black";
    String name;

    private static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);


    public static void specialProperty(){
        System.out.println("Lives on Land..");
    }

    protected void scopeMethod(){
        System.out.println("Inside child scope method");
    }

    void color(){
        LOGGER.info(String.valueOf(super.eyes));
    }

    public Dog() {
        LOGGER.info("Creating dog...");
    }
}
