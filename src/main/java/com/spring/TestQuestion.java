package com.spring;

public class TestQuestion {
    public static void main(String[] args) {
        A a = new C();
        a.show();
        B b = new C();
        b.show();
    }
}

class A{
    void show() {
        System.out.println("In A");
    }
}

class B extends A {
//    void show() {
//        System.out.println("In B");
//    }
}

class C extends B{
//    void show() {
//        System.out.println("In C");
//    }
}
