package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Generator;

public class Progression {
    private final static  int maxSequenceLength = 10;
    private final static  int minSequenceLength = 5;
    private final static  int maxArifmeticProgresion = 4;
    public static void playGame() {
        var resultGame = true;
        Engine.sayHello();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.quantityAround; i++) {
            var numMin = Generator.generateRandomNums(Generator.minNums, Generator.maxNums);
            var volSequenceLength = Generator.generateRandomNums(minSequenceLength, maxSequenceLength);
            var volArifmeticProgresion = Generator.generateRandomNums(1, maxArifmeticProgresion);
            var possitionHiddenNumber = Generator.generateRandomNums(0, volSequenceLength);
            var hiddenNumber = possitionHiddenNumber * volArifmeticProgresion + numMin;
            var expresion = getExpresion(numMin, volSequenceLength, possitionHiddenNumber, volArifmeticProgresion);
            var resultComparisonQuestionAndAnswer = Engine.comparisonQuestionAndAnswer(hiddenNumber, expresion);
            if (!resultComparisonQuestionAndAnswer) {
                resultGame = false;
                break;
            }
        }
        Engine.gerResultGame(resultGame);
    }

    private static String getExpresion(int numMin, int volSequenceLength
            , int possitionHiddenNumber, int volArifmeticProgresion) {
        var result = new StringBuilder();
        var count = numMin;
        for (int i = 0; i < volSequenceLength - 1; i++) {
            if (i == possitionHiddenNumber) {
                result.append(".. ");
            } else {
                result.append(count);
                result.append(" ");
            }
            count += volArifmeticProgresion;
        }
        result.append(count);
        return result.toString();
    }
}
