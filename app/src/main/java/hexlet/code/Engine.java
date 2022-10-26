package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void playGame(String[][] questionsAndCorrectAnswers, String task) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        System.out.print("Welcome to the Brain Games!" + "\n" + "May I have your name? ");
        userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        var result = true;
        for (String[] questionAndCorrectAnswer : questionsAndCorrectAnswers) {
            System.out.println("Question: " + questionAndCorrectAnswer[0]);
            System.out.print("Your answer: ");
            var answer = scanner.nextLine();
            if (answer.equals(questionAndCorrectAnswer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionAndCorrectAnswer[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
