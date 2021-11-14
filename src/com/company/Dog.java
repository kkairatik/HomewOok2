package com.company;

public class Dog extends Animal implements Printable{
    private int age;
    private String typeOfAnimal;


    public Dog(String name, String color, int age, String typeOfAnimal) {
        super(name, color);
        this.age = age;
        this.typeOfAnimal = typeOfAnimal;
    }




    public Dog(String name) {
        super(name);
    }


    @Override
    public void print() {
        System.out.println("Возраст:  " + age +
                "\n Тип животного :" + typeOfAnimal);

    }
}
