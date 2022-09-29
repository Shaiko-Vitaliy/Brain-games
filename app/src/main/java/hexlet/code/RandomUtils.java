package hexlet.code;

public class RandomUtils {
    private static final int MAX_RANDOM_NUMS = 20;
    private static final int MIN_RANDOM_NUMS = 0;
    public static int generateRandomNums(int minNums, int maxNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, maxNums);
    }

    public static int generateRandomNums(int minNums) {
        return org.apache.commons.lang3.RandomUtils.nextInt(minNums, MAX_RANDOM_NUMS);
    }

    public static int generateRandomNums() {
        return org.apache.commons.lang3.RandomUtils.nextInt(MIN_RANDOM_NUMS, MAX_RANDOM_NUMS);
    }
}
//ewf
