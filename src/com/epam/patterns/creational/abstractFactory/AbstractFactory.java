package com.epam.patterns.creational.abstractFactory;

public class AbstractFactory {

    public static void main(String[] args) {
        BusinessLunchFactory businessLunchFactory = AbstractFactory.getBusinessLunchFactory(LunchType.Chinese);

        FirstDish firstDish = businessLunchFactory.cookFirstDish();
        SecondDish secondDish = businessLunchFactory.cookSecondDish();
        Desert desert = businessLunchFactory.cookDesert();

        BusinessLunchPack pack = new BusinessLunchPack(firstDish, secondDish, desert);

    }

    static BusinessLunchFactory getBusinessLunchFactory (LunchType lunchType){
        switch (lunchType){
            case Chinese: return new ChineseBusinessLunchFactory();
            default: throw new IllegalArgumentException();
        }

    }

}

