package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class GCD {

    public static void playGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = RandomUtils.generateRandomNums(1, RandomUtils.maxNums);
            var num2 = RandomUtils.generateRandomNums(1, RandomUtils.maxNums);
            var expresion = num1 + " " + num2;
            var resultComparisonQuestionAndAnswer = Engine.getResultGame(num1, num2, expresion);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.getResultGame(resultGame);
    }
}
