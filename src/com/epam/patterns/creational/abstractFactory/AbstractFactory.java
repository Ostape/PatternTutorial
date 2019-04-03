package com.epam.patterns.creational.abstractFactory;

public abstract class AbstractFactory {

    public static void main(String[] args) {
        cookPack(LunchType.Ukrainian);
    }

    private static void cookPack(LunchType lunchType) {
        BusinessLunchFactory businessLunchFactory
                = AbstractFactory
                .getBusinessLunchFactory(lunchType);

        FirstDish firstDish = businessLunchFactory
                .cookFirstDish();
        SecondDish secondDish = businessLunchFactory
                .cookSecondDish();
        Desert desert = businessLunchFactory
                .cookDesert();

        BusinessLunchPack pack = new BusinessLunchPack.PackBuilder
                (firstDish, secondDish, desert)
                .setDesert2(desert)
                .setSecondDish2(secondDish)
                .setDesert3(desert)
                .build();

        System.out.println(pack);
    }

    static BusinessLunchFactory getBusinessLunchFactory (LunchType lunchType){
        switch (lunchType){
            case Chinese: return new ChineseBusinessLunchFactory();
            case Ukrainian: return UkrainianBusinessLunchFactory.UKRAINIAN_BUSINESS_LUNCH_FACTORY;
            default: throw new IllegalArgumentException();
        }

    }

}

