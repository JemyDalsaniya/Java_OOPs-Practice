package com.spring.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
    int eyes = 2;
    int legs = 4;
    private static final Logger LOGGER = LoggerFactory.getLogger(Animal.class);

    public Animal() {
        LOGGER.info("Generating Animal...");
    }

    public static void specialProperty(){
        System.out.println("Generic implementation of parent class..");
    }

    private void scopeMethod(){
        System.out.println("Inside Parent scope method");
    }
}
