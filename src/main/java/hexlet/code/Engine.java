package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static Scanner scanner = new Scanner(System.in);
    public static int quantityAround = 3;

    public static boolean getResultGame(int num1, int num2, int numberMathematicalOperation, String expression) {
        var resultCalculation = Engine.getCalculationResult(num1, num2, numberMathematicalOperation);
        return comparisonQuestionAndAnswer(resultCalculation, expression);
    }

    public static boolean getResultGame(int num1, int num2, String expression) {
        var resultCalculation = Engine.getCalculationResult(num1, num2);
        return comparisonQuestionAndAnswer(resultCalculation, expression);
    }

    public static boolean getResultGame(int num1, String expression) {
        var resultCalculation = Engine.getCalculationResult(num1);
        return comparisonQuestionAndAnswer(expression, resultCalculation);
    }

    public static boolean getResultGame(String expressionNum, String resultCalculation) {
        return comparisonQuestionAndAnswer(expressionNum, resultCalculation);
    }

    public static boolean getResultGame(String resultCalculation, int expressionNum) {
        return comparisonQuestionAndAnswer(expressionNum, resultCalculation);
    }

    public static void getResultGame(boolean resultGame) {
        if (resultGame) {
        System.out.println("Congratulations, " + App.userName + "!");
        }
    }

    private static int getCalculationResult(int num1, int num2, int numberMathematicalOperation) {
        if (numberMathematicalOperation == 0) {
            return num1 + num2;
        } else if (numberMathematicalOperation == 1) {
            return num1 - num2;
        } else {
            return num1 * num2;
        }
    }

    private static int getCalculationResult(int num1, int num2) {
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

    private static String getCalculationResult(int num1) {
        if (num1 % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean comparisonQuestionAndAnswer(int hiddenNumber, String expresion) {
        System.out.println("Question: " + expresion);
        System.out.print("Your answer: ");
        var answer = Engine.scanner.nextInt();
        Engine.scanner.nextLine();
        if (answer == hiddenNumber) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + hiddenNumber + "'.");
            System.out.println("Let's try again, " + App.userName + "!");
            return false;
        }
        return true;
    }

    private static boolean comparisonQuestionAndAnswer( String num1, String resultCalculation) {
        System.out.println("Question: " + num1);
        System.out.print("Your answer: ");
        var answer = Engine.scanner.nextLine();
        if (answer.equals(resultCalculation)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + resultCalculation + "'.");
            System.out.println("Let's try again, " + App.userName + "!");
            return false;
        }
        return true;
    }
}
