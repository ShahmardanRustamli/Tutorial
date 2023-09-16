package util;

import java.util.Random;

public class RandomUtil {
    public int getRandomIndex(int length){
        Random random = new Random();
        return random.nextInt(length);
    }

    private RandomUtil(){

    }
    private static RandomUtil instance;
    public static RandomUtil getInstance(){
        return instance==null ? instance = new RandomUtil() : instance;

    }
}
