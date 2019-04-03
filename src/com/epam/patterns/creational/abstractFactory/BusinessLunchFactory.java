package com.epam.patterns.creational.abstractFactory;

interface BusinessLunchFactory{
    FirstDish cookFirstDish();
    SecondDish cookSecondDish();
    Desert cookDesert();
}
