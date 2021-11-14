package com.company;

public abstract class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Animal(String name) {
    }
    public abstract void  print();


}

