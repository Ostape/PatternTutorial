package com.epam.solid;

public class OpenClosedWrong {
    public static void main(String[] args) {
        AnimalWrong animalWrong = new CatWrong();
        AnimalWrong.eat(animalWrong);

        Animal animal = new Cat();
        animal.eat();
    }
}

class AnimalWrong {

    static void eat(AnimalWrong animal){
        if (animal instanceof DogWrong){
            System.out.println("I am dog");
        }else if(animal instanceof CatWrong){
            System.out.println("I am cat");
        }else {
            System.out.println("I am wrong");
        }
    }

}

class DogWrong extends AnimalWrong{

}

class CatWrong extends AnimalWrong{

}