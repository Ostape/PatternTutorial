package com.epam.patterns.creational.abstractFactory;

class ChineseBusinessLunchFactory implements BusinessLunchFactory{
    @Override
    public FirstDish cookFirstDish() {
        return new Miso();
    }

    @Override
    public SecondDish cookSecondDish() {
        return new Ramen();
    }

    @Override
    public Desert cookDesert() {
        return new ChineseDesert();
    }
}
