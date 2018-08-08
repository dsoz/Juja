package ua.com.juja.core;

/**
 * Created by Diana on 19.07.2018.
 */
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] array = new int[256 * 1024];
        Random rnd = new Random(0);
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt();
        }
        long t1 = System.nanoTime();

        System.out.println("A:" + (System.nanoTime() - t1) / 1_000_000);

    }
}

// A:11184