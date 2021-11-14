package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] arrayAnimals = {createObject("Cat"), createObject("Dog"), createObject("Elephant")};

        for  (Animal animal : arrayAnimals) {
            animal.print();

        }
    }

    public static Animal createObject(String className) {
        switch (className) {

            case "Cat":

                Cat cat = new Cat("Саня", "Black", 12, "Кошка");
                return cat;


            case "Dog":
                Dog dog = new Dog("Rex", "White", 9, "Собака");
                return dog;


            case "Elephant":
                Elephant elephant = new Elephant("Рыжик", "Серый", 11, "Слон");
                return elephant;

        }
        return null;
}
}
