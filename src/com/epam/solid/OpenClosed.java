package com.epam.solid;

public class OpenClosed {
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("i am dog. I am eating");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("i am cat. I am eating");
    }
}

abstract class Animal{
    abstract void eat();
}