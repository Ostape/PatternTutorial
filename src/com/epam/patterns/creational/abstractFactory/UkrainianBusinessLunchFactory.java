package com.epam.patterns.creational.abstractFactory;

public enum  UkrainianBusinessLunchFactory implements BusinessLunchFactory {
    UKRAINIAN_BUSINESS_LUNCH_FACTORY;

    @Override
    public FirstDish cookFirstDish() {
        System.out.println("I am cooking first dish Ukrainian type");
        return new Borsch();
    }

    @Override
    public SecondDish cookSecondDish() {
        System.out.println("I am cooking second dish Ukrainian type");
        return new Deruni();
    }

    @Override
    public Desert cookDesert() {
        System.out.println("I am cooking desert Ukrainian type");

        return new Nalusnyk();
    }
}

class Borsch extends FirstDish{
    @Override
    void eat() {
        System.out.println("someone eating borsch");
    }

    @Override
    public String toString() {
        return "I am Borsch";
    }
}

class Deruni extends SecondDish{
    @Override
    public String toString() {
        return "I am Deruni";
    }
}

class Nalusnyk extends Desert{
    @Override
    public String toString() {
        return "I am Nalusnyk";
    }
}