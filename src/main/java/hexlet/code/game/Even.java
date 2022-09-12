package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Even {
    private static final int NUMBER_OF_LAUNCHES = 3;
    public static void playGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            int num1 = RandomUtils.generateRandomNums();
            String exprision = num1 + "";
            var resultComparisonQuestionAndAnswer = Engine.getResultGame(num1, exprision);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.getResultGame(resultGame);
    }
}
