package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Progression {
    private static final int MAX_SEQUENCE_LENGTH = 10;
    private static final int MIN_SEQUNCE_LENGTH = 5;
    private static final int MAX_ARIFMETIC_PROGRESSION = 4;
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TYPE_OF_GAME = "Progression";
    public static void startGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var numMin = RandomUtils.generateRandomNums();
            var volSequenceLength = RandomUtils.generateRandomNums(MIN_SEQUNCE_LENGTH, MAX_SEQUENCE_LENGTH);
            var volArifmeticProgresion = RandomUtils.generateRandomNums(1, MAX_ARIFMETIC_PROGRESSION);
            var possitionHiddenNumber = RandomUtils.generateRandomNums(0, volSequenceLength - 1);
            var hiddenNumber = possitionHiddenNumber * volArifmeticProgresion + numMin;
            var tasks = new String[1];
            tasks[0] = String.valueOf(hiddenNumber);
            var expression  = formingExpresion(numMin, volSequenceLength,
                    possitionHiddenNumber, volArifmeticProgresion);
            var resultComparisonQuestionAndAnswer = Engine.playGame(tasks, expression, TYPE_OF_GAME);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        if (resultGame) {
            System.out.println("Congratulations, " + App.getUserName() + "!");
        }
    }

    private static String formingExpresion(int numMin, int volSequenceLength,
                                       int possitionHiddenNumber, int volArifmeticProgresion) {
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
