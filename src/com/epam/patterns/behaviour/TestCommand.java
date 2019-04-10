package com.epam.patterns.behaviour;

import java.util.Scanner;

public class TestCommand {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        String name = scanner.nextLine();


//        switch (action){
//                    case "login" : System.out.println("Greeting " + name);
//                        break;
//                    case "logout" : System.out.println("Bye " + name);
//                        break;
//                    default:
//                        throw new IllegalArgumentException("Incorrect action");
//        }

        Command command = getCommand(action);
        command.execute(name);
    }

    private static Command getCommand(String action){
        switch (action){
            case "login" : return new LoginCommand();
            case "logout" : return new LogoutCommand();
            default:
                throw new IllegalArgumentException("Incorrect action");
        }
    }
}
