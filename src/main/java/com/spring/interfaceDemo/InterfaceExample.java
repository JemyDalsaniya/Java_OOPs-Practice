package com.spring.interfaceDemo;

public class InterfaceExample implements Car, Person {

    String s1 = "hello"; // By default static, final and public

    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample();
        interfaceExample.start();
        interfaceExample.run();
        interfaceExample.stop();
    }

    //By default methods will be Public and Abstract
    @Override
    public void start() {
        System.out.println("car is starting...");
    }

    @Override
    public void run() {
        Person.super.run(); //Diamond problem solved
    }


    @Override
    public void walk() {
        System.out.println("person id walking..");
    }

    public void stop() {
        Car.stop();
        System.out.println("car is stopping in InterfaceExample...");
    }
}

interface Car {
    void start();

    default void run() {
        System.out.println("car is running...");
    }

    //static methods can not override
    static void stop() {
        System.out.println("car is stopping...");
    }
}

interface Person {
    void walk();

    default void run() {
        System.out.println("person is running...");
    }
}
