package com.epam.solid;

public class Liskova {
    private StandardCoffeeMachine standardCoffeeMachine = new StandardCoffeeMachine();

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new StandardCoffeeMachine();

    }

    void brewCoffee(){
        standardCoffeeMachine.brewCoffee();
        System.out.println("coffee type " + standardCoffeeMachine.getCoffeeType());
    }

}

abstract class CoffeeMachine {

    abstract void brewCoffee();
}

class StandardCoffeeMachine extends CoffeeMachine{
    @Override
    void brewCoffee() {
        System.out.println("I am brewing coffee standard");
    }

    String getCoffeeType(){
        return "Coffee type Standard";
    }
}

class PremiumCoffeeMachine extends CoffeeMachine{
    @Override
    void brewCoffee() {
        System.out.println("I am brewing cool coffee");
    }

     void getCoffeeType(){
        System.out.println("Just premium");
    }
}