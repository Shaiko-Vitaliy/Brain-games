package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Calc {
    private final static int quantityMathematicalOperation = 3;
    public static void playGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = RandomUtils.generateRandomNums(RandomUtils.minNums, RandomUtils.maxNums);
            var num2 = RandomUtils.generateRandomNums(RandomUtils.minNums, RandomUtils.maxNums);
            var numberMathematicalOperation =
                    RandomUtils.generateRandomNums(RandomUtils.minNums, quantityMathematicalOperation);
            var expression = num1 + " " + getMathematicalOperation(numberMathematicalOperation) + " " + num2;
            var resultComparisonQuestionAndAnswer = Engine.getResultGame(num1, num2
                    , numberMathematicalOperation, expression);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.getResultGame(resultGame);
    }

    private static String getMathematicalOperation(int numberMathematicalOperation) {
        if (numberMathematicalOperation == 0) {
            return "+";
        } else if (numberMathematicalOperation == 1) {
            return "-";
        } else {
            return "*";
        }
    }


}