package hexlet;

import hexlet.code.game.*;
import hexlet.code.Engine;

public class App {
    public static void main(String[] args) {
        choiseGame();
    }

    public static void choiseGame() {
        menuOutput();
        var numGame = Engine.scanner.nextInt();
        Engine.scanner.nextLine();
        if (numGame == 1) {
            Cli.sayHello();
        } else if (numGame == 2) {
            Even.playGame();
        } else if (numGame == 3) {
            Calc.playGame();
        } else if (numGame == 4) {
            GCD.playGame();
        } else if (numGame == 5) {
            Progression.playGame();
        } else if (numGame == 6) {
            Prime.playGame();
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
}
