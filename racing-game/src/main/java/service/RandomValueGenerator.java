package service;

import java.util.Random;

public class RandomValueGenerator implements NumberGenarator{
    private static final Random random = new Random();

    public int generate(){
        return random.nextInt(10);
    }
}
