package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        var expressions = new String[NUMBER_OF_LAUNCHES];
        var correctAnswers = new String[NUMBER_OF_LAUNCHES];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            int testedNum = RandomUtils.generateRandomNums();
            expressions[i] = String.valueOf(testedNum);
            correctAnswers[i] = evenParity(testedNum);
        }
        Engine.playGame(expressions, correctAnswers, QUESTION);
    }

    private static String evenParity(int num) {
        if (num % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}


