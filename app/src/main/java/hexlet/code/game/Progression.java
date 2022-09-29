package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {
    private static final int MAX_SEQUENCE_LENGTH = 10;
    private static final int MIN_SEQUNCE_LENGTH = 5;
    private static final int MAX_ARIFMETIC_PROGRESSION = 4;
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String QUESTION = "What number is missing in the progression?";
    public static void startGame() {
        var expressions = new String[NUMBER_OF_LAUNCHES];
        var correctAnswers = new String[NUMBER_OF_LAUNCHES];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var numMinForProgression = RandomUtils.generateRandomNums();
            var volSequenceLength = RandomUtils.generateRandomNums(MIN_SEQUNCE_LENGTH, MAX_SEQUENCE_LENGTH);
            var volArifmeticProgresion = RandomUtils.generateRandomNums(1, MAX_ARIFMETIC_PROGRESSION);
            var possitionHiddenNumber = RandomUtils.generateRandomNums(0, volSequenceLength - 1);
            expressions[i]  = formingExpression(numMinForProgression, volSequenceLength, volArifmeticProgresion);
            correctAnswers[i] = String.valueOf(possitionHiddenNumber * volArifmeticProgresion + numMinForProgression);
        }
        Engine.playGame(expressions, correctAnswers, QUESTION);
    }

    private static String formingExpression(int numMin, int volSequenceLength, int volArifmeticProgresion) {
        var result = new StringBuilder();
        var count = numMin;
        for (int i = 0; i < volSequenceLength; i++) {
            result.append(count);
            result.append(" ");
            count += volArifmeticProgresion;
        }
        return result.toString();
    }
}
//ewf
