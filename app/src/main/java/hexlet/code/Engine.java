package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void playGame(String[] expressions, String[] correctAnswers, String question) {
        App.sayHello();
        System.out.println(question);
        var result = true;
        for (var i = 0; i < expressions.length; i++) {
            result = comparisonQuestionAndAnswer(expressions[i], correctAnswers[i], question);
            if (!result) {
                break;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + App.getUserName() + "!");
        }
    }

    private static boolean comparisonQuestionAndAnswer(String expression, String correctAnswer, String question) {
        var expressionFinal = "";
        if (question.equals("What number is missing in the progression?")) {
            expressionFinal = hideNumberInProgression(expression, correctAnswer);
        } else {
            expressionFinal = expression;
        }
        System.out.println("Question: " + expressionFinal);
        System.out.print("Your answer: ");
        var answer = SCANNER.nextLine();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                    + correctAnswer + "'.");
            System.out.println("Let's try again, " + App.getUserName() + "!");
            return false;
        }
        return true;
    }

    private static String hideNumberInProgression(String expression, String correctAnswer) {
        var sequenceNums = expression.split(" ");
        var expressionFinal = "";
        for (String sequenceNum : sequenceNums) {
            if (sequenceNum.equals(correctAnswer)) {
                expressionFinal = expressionFinal + ".. ";
            } else {
                expressionFinal = expressionFinal + sequenceNum + " ";
            }
        }
        return expressionFinal;
    }
}

