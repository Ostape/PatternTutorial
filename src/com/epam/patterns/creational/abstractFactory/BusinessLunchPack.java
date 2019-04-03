package com.epam.patterns.creational.abstractFactory;

class BusinessLunchPack {
    private FirstDish firstDish;
    private SecondDish secondDish;
    private Desert desert;

    public BusinessLunchPack(FirstDish firstDish, SecondDish secondDish, Desert desert) {
        this.firstDish = firstDish;
        this.secondDish = secondDish;
        this.desert = desert;
    }

    public FirstDish getFirstDish() {
        return firstDish;
    }

    public SecondDish getSecondDish() {
        return secondDish;
    }

    public Desert getDesert() {
        return desert;
    }
}
