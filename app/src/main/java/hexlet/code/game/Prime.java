package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        var expressions = new String[NUMBER_OF_LAUNCHES];
        var correctAnswers = new String[NUMBER_OF_LAUNCHES];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var checkNum = RandomUtils.generateRandomNums();
            expressions[i] = String.valueOf(checkNum);
            correctAnswers[i] = isPrimes(checkNum) ? "yes" : "no";
        }
        Engine.playGame(expressions, correctAnswers, QUESTION);
    }
    // check
    private static boolean isPrimes(int checkNum) {
        if (checkNum == 2) {
            return true;
        }
        if (checkNum == 1 || checkNum % 2 == 0) {
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
