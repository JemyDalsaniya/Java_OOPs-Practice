package com.spring.inheritance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger _log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        //Single inheritance
        //IS-A Relationship (Dog is animal)
        Dog dog = new Dog();
        //System.out.println(dog.eyes);
//        System.out.println(dog.color);

        //Multilevel inheritance
        //Labrador lab = new Labrador();
        // System.out.println(lab.color);
        // System.out.println(lab.legs);

        //Hierarchical inheritance
        // Fish fish = new Fish();
        //System.out.println(fish.eyes);

        //Driver driver = new Driver();
        //System.out.println(driver.car.wheels);

        /*Inheritance(Is-A relationship)
            Types of association:
                 Weak association(One object can live without another object): Aggregation(Has-A relationship)
                 Strong Association(One object can not exist without another object): Composition(Part of relationship)*/

        //When Both concepts are used together that Dynamic polymorphism and static methods then after creating the memory is assigned to child class it will call the method of parent only
        Animal animal = new Dog();
        animal.specialProperty();

        dog.scopeMethod();


    }
}

