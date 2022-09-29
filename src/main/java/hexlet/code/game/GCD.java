package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class GCD {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TYPE_OF_GAME = "GCD";

    public static void startGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("Find the greatest common divisor of given numbers.");
        var tasks = new String[2];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var firstNumerator = RandomUtils.generateRandomNums(1);
            var secondNumerator = RandomUtils.generateRandomNums(1);
            var expression = firstNumerator + " " + secondNumerator;
            tasks[0] = String.valueOf(firstNumerator);
            tasks[1] = String.valueOf(secondNumerator);
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
}
