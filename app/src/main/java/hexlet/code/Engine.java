package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void playGame(String[] expressions, String[] correctAnswers, String question) {
        App.sayHello();
        System.out.println(question);
        var result = true;
        for (var i = 0; i < expressions.length; i++) {
            result = comparisonQuestionAndAnswer(expressions[i], correctAnswers[i]);
            if (!result) {
                return;
            }
        }
            System.out.println("Congratulations, " + App.getUserName() + "!");
    }

    private static boolean comparisonQuestionAndAnswer(String expression, String correctAnswer) {
        System.out.println("Question: " + expression);
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

}
