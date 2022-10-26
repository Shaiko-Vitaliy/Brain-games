package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {
    private static final int MATHEMATICAL_OPERATION = 3;
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TASK = "What is the result of the expression?";
    public static void startGame() {
        var questionsAndCorrectAnswers = new String[NUMBER_OF_LAUNCHES][2];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var firstSummand = RandomUtils.generateRandomNums();
            var secondSummand = RandomUtils.generateRandomNums();
            var mathematicalOperation = generateMathematicalOperation();
            questionsAndCorrectAnswers[i][0] = firstSummand + " " + mathematicalOperation + " " + secondSummand;
            questionsAndCorrectAnswers[i][1] = Calculator.calculationOfNumbers(firstSummand, secondSummand,
                    mathematicalOperation);
        }
        Engine.playGame(questionsAndCorrectAnswers, TASK);
    }
    private static String generateMathematicalOperation() {
        var numberMathematicalOperation = RandomUtils.generateRandomNums(0, MATHEMATICAL_OPERATION);
        String mathematicalOperation = "";
        switch (numberMathematicalOperation) {
            case 0 :
                mathematicalOperation = "+";
                break;
            case 1 :
                mathematicalOperation = "-";
                break;
            case 2 :
                mathematicalOperation = "*";
                break;
            default :
                break;
        }
        return mathematicalOperation;
    }

    private static String calculationOfNumbers(int firstSummand, int secondSummand, String mathematicalOperation) {
        var result = 0;
        if (mathematicalOperation.equals("+")) {
            result = firstSummand + secondSummand;
        } else if (mathematicalOperation.equals("-")) {
            result = firstSummand - secondSummand;
        } else {
            result = firstSummand * secondSummand;
        }
        return String.valueOf(result);
    }
}
