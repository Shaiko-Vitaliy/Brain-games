package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Prime {
    public static void playGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = RandomUtils.generateRandomNums(RandomUtils.minNums, RandomUtils.maxNums);
            var resultCalculation = getCalculationResult(num1);
            var exprisionNum = num1 + "";
            var resultComparisonQuestionAndAnswer = Engine.getResultGame(exprisionNum, resultCalculation);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.getResultGame(resultGame);
    }

    public static String getCalculationResult(int num) {
        if (num == 2) {
            return "yes";
        }
        if (num == 1 || num % 2 == 0) {
            return "no";
        }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
