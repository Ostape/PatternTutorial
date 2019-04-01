package com.epam.patterns.creational.factory;

import java.util.Scanner;

public class Factory {
    public OS getCurrentOs(OsType osType){

        switch (osType){
            case MAC: return new MacOS();

            case WINDOWS: return new WindowsOS();

            case LINUX: return new LinuxOS();

            default: throw new IllegalArgumentException("OS do not support");
        }
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        System.out.println("Type your system (Windows, Mac, Linux) :");
        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        OS currentOs = factory.getCurrentOs(getOsType(osType));

        currentOs.getOS();

    }

    private static OsType getOsType(String osType) {
        try {
            return OsType.valueOf(osType.toUpperCase());
        }catch (IllegalArgumentException e){
            return OsType.Undefined;
        }
    }
}

