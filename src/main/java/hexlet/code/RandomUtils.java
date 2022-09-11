package hexlet.code;

public class RandomUtils {
    private final static int maxNums = 20;
    private final static int minNums = 0;
    public static int generateRandomNums(int minNums, int maxNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, maxNums);
    }

    public static int generateRandomNums(int minNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, maxNums);
    }

    public static int generateRandomNums() {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, maxNums);
    }
}
