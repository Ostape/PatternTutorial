package com.epam.patterns.behaviour;

public class LogoutCommand implements Command {
    @Override
    public void execute(String name) {
        System.out.println("Bye " + name);
    }
}
