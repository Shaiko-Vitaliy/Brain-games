package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Calc {
    private static final int MATHEMATICAL_OPERATION = 3;
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final int VALUE_TASKS = 3;
    private static final String TYPE_OF_GAME = "Calc";
    public static void startGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("What is the result of the expression?");
        var tasks = new String[VALUE_TASKS];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var firstSummand = RandomUtils.generateRandomNums();
            var secondSummand = RandomUtils.generateRandomNums();
            var mathematicalOperation = generateMathematicalOperation();
            var expression = firstSummand + " " + mathematicalOperation + " " + secondSummand;
            tasks[0] = String.valueOf(firstSummand);
            tasks[1] = mathematicalOperation;
            tasks[2] = String.valueOf(secondSummand);
            var resultComparisonQuestionAndAnswer = Engine.playGame(tasks, expression, TYPE_OF_GAME);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        if (resultGame) {
            System.out.println("Congratulations, " + App.getUserName() + "!");
        }
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
}
