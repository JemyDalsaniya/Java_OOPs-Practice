package com.spring.inheritance;

//Weak association(One object can live without another object): Aggregation(Has-A relationship)
//Both objects can exist independently
//Louse coupling
public class Driver {

    String name = "Ram";
    public Car car;

    public Driver(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public Driver() {
        this.car = new Car();
    }
}
