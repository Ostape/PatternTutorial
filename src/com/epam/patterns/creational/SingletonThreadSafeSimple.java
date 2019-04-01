package com.epam.patterns.creational;

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
}
