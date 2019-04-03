package com.epam.patterns.creational.factory;

import java.util.Scanner;

public class Factory {
    public static OS getCurrentOs(OsType osType){

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
        OsType osType1 = getOsType(osType);
        OS currentOs = factory.getCurrentOs(osType1);

        getCurrentOs2(osType1);

        currentOs.getOS();

    }

    public static void getCurrentOs2(OsType osType1) {
        if(OsType.MAC.equals(osType1)){
            new MacOS().getOS();
        }else if (OsType.LINUX.equals(osType1)){
            new LinuxOS().getOS();
        } else if(OsType.WINDOWS.equals(osType1)){
            new WindowsOS().getOS();
        }else {
            throw new IllegalArgumentException();
        }
    }

    private static OsType getOsType(String osType) {
        try {
            return OsType.valueOf(osType.toUpperCase());
        }catch (IllegalArgumentException e){
            return OsType.Undefined;
        }
    }
}

