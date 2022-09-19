package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static boolean playGame(String[] tasks, String expression, String typeOfGame) {
        var result = false;
        switch (typeOfGame) {
            case "Calc" :
                var resultCalculation = Engine.calculationOfNumbers(tasks);
                result = comparisonQuestionAndAnswer(resultCalculation, expression);
                break;
            case "Even" :
                var resultEvenParity = Engine.evenParity(tasks);
                result = comparisonQuestionAndAnswer(resultEvenParity, expression);
                break;
            case "GCD" :
                var resultCalculation1 = Engine.searchDivisor(tasks);
                result = comparisonQuestionAndAnswer(resultCalculation1, expression);
                break;
            case "Prime" :
                result = comparisonQuestionAndAnswer(tasks[0], expression);
                break;
            case "Progression" :
                result = comparisonQuestionAndAnswerForProgression(tasks[0], expression);
                break;
            default:
                break;
        }
        return result;
    }

    private static String calculationOfNumbers(String[] tasks) {
        String mathematicalOperation = tasks[1];
        int firstSummand = Integer.parseInt(tasks[0]);
        int secondSummand = Integer.parseInt(tasks[2]);
        var result = 0;
        if (mathematicalOperation.equals("+")) {
            result = firstSummand + secondSummand;
        } else if (mathematicalOperation.equals("-")) {
            result = firstSummand - secondSummand;
        } else {
            result = firstSummand * secondSummand;
        }
        return String.valueOf(result);
    }

    private static String searchDivisor(String[] tasks) {
        var firstNumerator = Integer.parseInt(tasks[0]);
        var secondNumerator = Integer.parseInt(tasks[1]);
        var minNum = Math.min(firstNumerator, secondNumerator);
        var maxNum = Math.max(firstNumerator, secondNumerator);
        var result = 1;
        if (maxNum % minNum == 0) {
            result = minNum;
            return String.valueOf(result);
        } else {
            for (int i = 1; i < minNum / 2; i++) {
                if (minNum % i == 0 && maxNum % i == 0) {
                    result = i;
                }
            }
        }
        return String.valueOf(result);
    }

    private static String evenParity(String[] tasks) {
        int evenOrNotEvenNum = Integer.parseInt(tasks[0]);
        if (evenOrNotEvenNum % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean comparisonQuestionAndAnswer(String resultCalculation, String expression) {
        System.out.println("Question: " + expression);
        System.out.print("Your answer: ");
        var answer = SCANNER.nextLine();
        if (answer.equals(resultCalculation)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + resultCalculation + "'.");
            System.out.println("Let's try again, " + App.getUserName() + "!");
            return false;
        }
        return true;
    }

    private static boolean comparisonQuestionAndAnswerForProgression(String resultCalculation, String expression) {
        var sequenceNums = expression.split(" ");
        var expressionFinal = "";
        for (String sequenceNum : sequenceNums) {
            if (sequenceNum.equals(resultCalculation)) {
                expressionFinal = expressionFinal + ".. ";
            } else {
                expressionFinal = expressionFinal + sequenceNum + " ";
            }
        }
        System.out.println("Question: " + expressionFinal);
        System.out.print("Your answer: ");
        var answer = SCANNER.nextLine();
        if (answer.equals(resultCalculation)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + resultCalculation + "'.");
            System.out.println("Let's try again, " + App.getUserName() + "!");
            return false;
        }
        return true;
    }
}
