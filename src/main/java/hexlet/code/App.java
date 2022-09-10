package hexlet.code;

import hexlet.code.game.*;

public class App {

    public static String userName = "";
    public static void main(String[] args) {
        choiseGame();
    }

    public static void choiseGame() {
        menuOutput();
        var numGame = Engine.scanner.nextInt();
        Engine.scanner.nextLine();
        switch (numGame) {
            case 1:
                Greet.sayHello();
                break;
            case 2:
                Even.playGame();
                break;
            case 3:
                Calc.playGame();
                break;
            case 4:
                GCD.playGame();
                break;
            case 5:
                Progression.playGame();
                break;
            case 6:
                Prime.playGame();
                break;
            default:
                break;
        }
    }

    public  static void menuOutput() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

    public static void sayHello() {
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        App.userName = Engine.scanner.nextLine();
        System.out.println("Hello, " + App.userName + "!");
    }
}

