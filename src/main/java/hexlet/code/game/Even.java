package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Even {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TYPE_OF_GAME = "Even";
    public static void startGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var tasks = new String[1];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            int testedNum = RandomUtils.generateRandomNums();
            String expression = String.valueOf(testedNum);
            tasks[0] = String.valueOf(testedNum);
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
}
