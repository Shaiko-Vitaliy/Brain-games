package hexlet;

import java.util.Scanner;

public class Cli {
    public static void sayHello() {
        System.out.print("Welcome to the Brain Games!");
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        var name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
