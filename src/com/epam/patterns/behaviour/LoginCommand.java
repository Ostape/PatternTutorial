package com.epam.patterns.behaviour;

public class LoginCommand implements Command {
    @Override
    public void execute(String name) {
        System.out.println("Greeting " + name);
    }
}
