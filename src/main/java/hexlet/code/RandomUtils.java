package hexlet.code;

public class RandomUtils {
    private static final int MAX_NUMS = 20;
    private static final int MIN_NUMS = 0;
    public static int generateRandomNums(int minNums, int maxNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, maxNums);
    }

    public static int generateRandomNums(int minNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, MAX_NUMS);
    }

    public static int generateRandomNums() {
        return org.apache.commons.lang3.RandomUtils.nextInt(MIN_NUMS, MAX_NUMS);
    }
}
