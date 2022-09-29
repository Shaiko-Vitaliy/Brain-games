package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.App;
import hexlet.code.RandomUtils;

public class Prime {
    private static final int NUMBER_OF_LAUNCHES = 3;
    private static final String TYPE_OF_GAME = "Prime";
    public static void startGame() {
        var resultGame = true;
        App.sayHello();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var tasks = new String[1];
        for (int i = 0; i < NUMBER_OF_LAUNCHES; i++) {
            var checkNum = RandomUtils.generateRandomNums();
            var resultCheckingForNumbersOnPrimes = checkingForNumbersOnPrimes(checkNum);
            var expression = String.valueOf(checkNum);
            tasks[0] = resultCheckingForNumbersOnPrimes;
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

    public static String checkingForNumbersOnPrimes(int checkNum) {
        if (checkNum == 2) {
            return "yes";
        }
        if (checkNum == 1 || checkNum % 2 == 0) {
            return "no";
        }
        for (var i = 2; i <= Math.sqrt(checkNum); i++) {
            if (checkNum % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
