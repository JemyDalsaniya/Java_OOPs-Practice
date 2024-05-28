package com.spring.polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pug extends Dog {

    private static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);
    void specialCapabilities(){
        LOGGER.info("Special capabilities of Pug class");
    }

}
