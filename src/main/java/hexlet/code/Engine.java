package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);
    public static String userName = "";
    public static int quantityAround = 3;

    public static void sayHello() {
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        Engine.userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }

    public static int getCalculationResult(int num1, int num2, int numberMathematicalOperation) {
        if (numberMathematicalOperation == 0) {
            return num1 + num2;
        } else if (numberMathematicalOperation == 1) {
            return num1 - num2;
        } else {
            return num1 * num2;
        }
    }

    public static int getCalculationResult(int num1, int num2) {
        var minNum = Math.min(num1, num2);
        var maxNum = Math.max(num1, num2);
        var result = 1;
        if (maxNum % minNum == 0) {
            result = minNum;
            return result;
        } else {
            for (int i = 1; i < minNum / 2; i++) {
                if (minNum % i == 0 && maxNum % i == 0) {
                    result = i;
                }
            }
        }
        return result;
    }

    public static String getCalculationResult(int num1) {
        if (num1 % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static boolean comparisonQuestionAndAnswer(int resultCalculation, String expresion) {
        System.out.println("Question: " + expresion);
        System.out.print("Your answer: ");
        var answer = Engine.scanner.nextInt();
        Engine.scanner.nextLine();
        if (answer == resultCalculation) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + resultCalculation + "'.");
            System.out.println("Let's try again, " + Engine.userName + "!");
            return false;
        }
        return true;
    }

    public static boolean comparisonQuestionAndAnswer(String num1, String resultCalculation) {
        System.out.println("Question: " + num1);
        System.out.print("Your answer: ");
        var answer = Engine.scanner.nextLine();
        if (answer.equals(resultCalculation)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + resultCalculation + "'.");
            System.out.println("Let's try again, " + Engine.userName + "!");
            return false;
        }
        return true;
    }

    public static void gerResultGame(boolean resultGame) {
        if (resultGame) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
