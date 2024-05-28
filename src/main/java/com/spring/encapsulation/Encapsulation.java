package com.spring.encapsulation;

public class Encapsulation {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setPrice(20);
        l1.ram=2;
        System.out.println("getting price :" + l1.getRam());

    }

    public void doWork() {
        System.out.println("Working working..");
    }
}

class Laptop {
    protected int ram;
    private int price;


    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        boolean isAdmin = false;
        if(!isAdmin) {
            System.out.println("Can not set price");
        }else {
            this.price = price;
        }
    }
}

