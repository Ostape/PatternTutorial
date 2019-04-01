package com.epam.patterns.creational.singleton;

public class SingletonThreadSafeSimple {

    private static SingletonThreadSafeSimple instance;

    private SingletonThreadSafeSimple(){

    }

    public static synchronized SingletonThreadSafeSimple getInstance(){
        if(instance == null){
            instance = new SingletonThreadSafeSimple();
        }
        return instance;
    }

    public static void showMe(){
        System.out.println("I am singletonn Thread safe");
    }

    public static void main(String[] args) {
        SingletonThreadSafeSimple.showMe();
    }
}
