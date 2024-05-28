package com.spring;

import com.spring.encapsulation.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age=20;
        p1.name="Jemy";
        p1.name="hello";
        //Compile time polymorphism(i.e. compiler already know that which walk method should be called)
        p1.walk();
        p1.walk(5);
        p1.eat();

        Person p2 = new Person("Brijesh", 21);
        //System.out.println(p2.name + " Turned : " +p2.age);


        //System.out.println("count :" + Person.count);

        Developer d1 = new Developer("Test", 2);
        //Run time polymorphism(i.e. compiler do not know that which walk method should be called. it will
        // check if developer have the walk method if developer do not have then it will check if parent have walk method or not)
        d1.walk();

        Encapsulation encapsulation = new Encapsulation();
        encapsulation.doWork();

    }
}
class Developer extends Person {


    public Developer(String name, int age) {
        super(name,age);
    }
    void walk() {
        //System.out.println("Developer "+name + "is walking..");
    }


}

class Person {

    protected String name;
    int age;
    static int count;

    public Person() {
        count++;
        //System.out.println("inside default constructor");
    }

    public Person(String name, int age) {
        this();
//        count++;
       // System.out.println("inside parameterized constructor");
        this.name = name;
        this.age = age;
    }

    void walk() {
       // System.out.println(name + "is walking..");
    }
    void walk(int steps) {
//        System.out.println(name + " walked " + steps);
    }

    boolean eat() {
//        System.out.println(name + "is eating..");
        return false;
    }

}


class Test {

    void hello() {
        Person testPerson = new Person();
        testPerson.name = "Test";
        testPerson.eat();
        System.out.println(testPerson.name);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.hello();
    }
}
