package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Prime {
    public static void playGame() {
        var resultGame = true;
        Engine.sayHello();
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var resultCalculation = getCalculationResult(num1);
            var exprision = num1 + "";
            var resultComparisonQuestionAndAnswer = Engine.comparisonQuestionAndAnswer(exprision, resultCalculation);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.gerResultGame(resultGame);
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
