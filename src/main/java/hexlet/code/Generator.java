package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

public class Generator {
    public static int maxNums = 100;
    public static int minNums = 0;
    public static int generateRandomNums(int minNums, int maxNums) {
        return RandomUtils.nextInt(minNums, maxNums);
    }
}
