package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Calc {
    private static final int quantityMathematicalOperation = 3;
    private static final int quantityAroundCalc = 3;
    public static void playGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < quantityAroundCalc; i++) {
            var num1 = RandomUtils.generateRandomNums();
            var num2 = RandomUtils.generateRandomNums();
            var numberMathematicalOperation =
                    RandomUtils.generateRandomNums(0, quantityMathematicalOperation);
            var expression = num1 + " " + getMathematicalOperation(numberMathematicalOperation) + " " + num2;
            var resultComparisonQuestionAndAnswer = Engine.getResultGame(num1, num2, numberMathematicalOperation, expression);
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