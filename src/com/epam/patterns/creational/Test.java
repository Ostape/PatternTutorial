package com.epam.patterns.creational;

import com.epam.patterns.creational.factory.*;

public class Test {
    public static void main(String[] args) {
        Factory.getCurrentOs2(OsType.LINUX);
    }
}
