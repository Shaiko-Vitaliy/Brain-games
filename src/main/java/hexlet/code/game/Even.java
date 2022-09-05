package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Even {
    public static void playGame() {
        var resultGame = true;
        Engine.sayHello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var resultCalculation = Engine.getCalculationResult(num1);
            var exprision = num1 + "";
            var resultComparisonQuestionAndAnswer = Engine.comparisonQuestionAndAnswer(exprision, resultCalculation);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.gerResultGame(resultGame);
    }
}