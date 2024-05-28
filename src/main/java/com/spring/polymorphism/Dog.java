package com.spring.polymorphism;

import com.spring.inheritance.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog  {
    String color = "black";
    String name;

    private static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);

    void specialCapabilities(){
        LOGGER.info("Special capabilities of Dog class");
    }
}
