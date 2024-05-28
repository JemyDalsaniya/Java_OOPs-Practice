package com.spring.polymorphism;

//2 types of Polymorphism
//1. Static polymorphism = Method Overloading
//2. Dynamic Polymorphism = Method Overriding
public class Main {

    //Method Overloading
    //Method having same name but different parameters
    //Ex. Add(a,b) and Add(a,b,c)
    //Can be achieved by Changing the number of arguments or By changing the data types
    //Note: Overloading is not possible by changing the return type only. It gives compile time error due to ambiguity

    //Type Promotion
    //Smaller data type is converted to bigger one if no matching data is found
    //E.G.
    //Add(int a, long b)
    //Call > add(4,5) then 5 will be promoted to long data type

    //Method Overriding
    //If child class has same method as parent class

    //Dynamic Polymorphism
    //A process in which a call to overridden method is resolved at runtime rather than at compile time
    //it can be achieved by Upcasting or overriding

    //Upcasting
    //reference variable of Parent class/Interface refers to the Object of child class

    public static void main(String[] args) {


        //Overriding
        Pug pug = new Pug();
        pug.specialCapabilities();
        Labrador labrador = new Labrador();
        labrador.specialCapabilities();

        //Runtime polymorphism
        Dog dogPug = new Pug(); //Upcasting(Memory is given to child class)
        dogPug.specialCapabilities();

        Dog dogLab = new Labrador();
        dogLab.specialCapabilities();


        sum(2,6);
        //sum(2L,6L);
       // sum(2L,6);

    }

    //Overloading
    static void sum(int a, int b){
        System.out.println("sum of int and int " + (a+b));;
    }
    static void sum(int a, long b){
        System.out.println("sum of int & long " + (a+b));;
    }
   static void sum(long a, int b){
        System.out.println("sum of long & int " + (a+b));;
    }

    static void sum(int a, int b,int c){
        System.out.println("sum of int & int & int " + (a+b+c));
    }
}
