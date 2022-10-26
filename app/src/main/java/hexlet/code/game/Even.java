package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void startGame() {
        var questionsAndCorrectAnswers = new String[NUMBER_OF_LAUNCHES][2];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            int testedNum = RandomUtils.generateRandomNums();
            questionsAndCorrectAnswers[i][0] = String.valueOf(testedNum);
            questionsAndCorrectAnswers[i][1] = isEven(testedNum) ? "yes" : "no";
        }
        Engine.playGame(questionsAndCorrectAnswers, TASK);
    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
