package hexlet.code;

public class RandomUtils {
    public static int maxNums = 20;
    public static int minNums = 0;
    public static int generateRandomNums(int minNums, int maxNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, maxNums);
    }
}
