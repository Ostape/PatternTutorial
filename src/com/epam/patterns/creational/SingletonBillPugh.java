package com.epam.patterns.creational;

public class SingletonBillPugh {
    private SingletonBillPugh(){

    }

    private static class SingletonHolder{
        private final static SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
