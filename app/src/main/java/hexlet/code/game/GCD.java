package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GCD {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        var expressions = new String[NUMBER_OF_LAUNCHES];
        var correctAnswers = new String[NUMBER_OF_LAUNCHES];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var firstNumerator = RandomUtils.generateRandomNums(1);
            var secondNumerator = RandomUtils.generateRandomNums(1);
            expressions[i] = firstNumerator + " " + secondNumerator;
            correctAnswers[i] = searchDivisor(firstNumerator, secondNumerator);
        }
        Engine.playGame(expressions, correctAnswers, QUESTION);
    }

    private static String searchDivisor(int firstNumerator, int secondNumerator) {
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
}
//ewf
