package com.spring.abstraction;

public class AbstractionDemo {


    public static void main(String[] args) {
       Audi audi = new Audi();
        audi.start();

    }
}

class Audi extends Car{

    @Override
    void start() {
        System.out.println("Starting Audi..");
    }
}

class BMW extends Car{

    @Override
    void start() {
        System.out.println("Starting BMW..");
    }
}

//Here abstract is used because we never need to make an object of car as suppose start method is there then any specific car model is going to start
abstract class Car {
    int price;
   abstract void start();
}

