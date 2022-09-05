package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Calc {
    private final static int quantityMathematicalOperation = 3;
    public static void playGame() {
        var resultGame = true;
        Engine.sayHello();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var num1 = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var num2 = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var numberMathematicalOperation =
                    Generator.generateRandomNums(Generator.minNums, quantityMathematicalOperation);
            var resultCalculation = Engine.getCalculationResult(num1, num2, numberMathematicalOperation);
            var expresion = num1 + " " + getMathematicalOperation(numberMathematicalOperation) + " " + num2;
            var resultComparisonQuestionAndAnswer = Engine.comparisonQuestionAndAnswer(resultCalculation, expresion);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.gerResultGame(resultGame);
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