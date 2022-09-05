package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class GCD {

    public static void playGame() {
        var resultGame = true;
        Engine.sayHello();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var num2 = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var resultCalculation = Engine.getCalculationResult(num1, num2);
            var expresion = num1 + " " + num2;
            var resultComparisonQuestionAndAnswer = Engine.comparisonQuestionAndAnswer(resultCalculation, expresion);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.gerResultGame(resultGame);
    }
}
