package com.epam.patterns.creational.factory;

class LinuxOS implements OS{
    @Override
    public void getOS() {
        System.out.println("I am LinuxOS");
    }
}
