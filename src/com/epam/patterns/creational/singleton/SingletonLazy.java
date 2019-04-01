package com.epam.patterns.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy instance = null;
    private SingletonLazy(){

    }
    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void setUp(){
        System.out.println("I am in");
    }
}
