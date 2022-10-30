package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        var questionsAndCorrectAnswers = new String[NUMBER_OF_LAUNCHES][2];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var negativeOrPositive = RandomUtils.generateRandomNums(0, 2);
            var randomNum = RandomUtils.generateRandomNums();
            var checkNum = negativeOrPositive == 1 ? randomNum : randomNum * (-1);
            questionsAndCorrectAnswers[i][0] = String.valueOf(checkNum);
            questionsAndCorrectAnswers[i][1] = isPrime(checkNum) ? "yes" : "no";
        }
        Engine.playGame(questionsAndCorrectAnswers, TASK);
    }
    private static boolean isPrime(int checkNum) {
        if (checkNum < 0 || checkNum == 1 || checkNum % 2 == 0) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}
