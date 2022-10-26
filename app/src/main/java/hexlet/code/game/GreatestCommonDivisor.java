package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GreatestCommonDivisor {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TASK = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        var questionsAndCorrectAnswers = new String[NUMBER_OF_LAUNCHES][2];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var firstNumerator = RandomUtils.generateRandomNums(1);
            var secondNumerator = RandomUtils.generateRandomNums(1);
            questionsAndCorrectAnswers[i][0] = firstNumerator + " " + secondNumerator;
            questionsAndCorrectAnswers[i][1] = searchDivisor(firstNumerator, secondNumerator);
        }
        Engine.playGame(questionsAndCorrectAnswers, TASK);
    }

    private static String searchDivisor(int firstNumerator, int secondNumerator) {
        var minNum = Math.min(firstNumerator, secondNumerator);
        var maxNum = Math.max(firstNumerator, secondNumerator);
        var result = 1;
        if (maxNum % minNum == 0) {
            result = minNum;
            return String.valueOf(result);
        } else {
            for (int i = 1; i <= minNum / 2; i++) {
                if (minNum % i == 0 && maxNum % i == 0) {
                    result = i;
                }
            }
        }
        return String.valueOf(result);
    }
}
