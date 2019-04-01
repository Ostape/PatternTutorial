package com.epam.patterns.creational.singleton;

import java.io.*;

public class SingletonSerialized implements Serializable {

    public static final long serialVersionUID = -8610417477740383133L;

    private SingletonSerialized(){

    }

    private static class SingletonHelper{
        private static final SingletonSerialized INSTANCE = new SingletonSerialized();
    }

    public static SingletonSerialized getInstance(){
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerialized instanceOne = SingletonSerialized.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("testSingleton.ser"));
        out.writeObject(instanceOne);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("testSingleton.ser"));
        SingletonSerialized instanceTwo = (SingletonSerialized) in.readObject();
        in.close();

        System.out.println("instanceOne hash: " + instanceOne.hashCode());
        System.out.println("instanceTwo hash: " + instanceTwo.hashCode());
    }










//    protected Object readResolve(){
//        return getInstance();
//    }
}
