package IG2.lesson16;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {



//        int[] data = new int[1024 * 1024 * 128]; //512MB
//
//        for (int i = 0; i < data.length; i++) {
//            data[i] = ThreadLocalRandom.current().nextInt();
//        }
//
//        int max = Integer.MIN_VALUE;
//        for (int value : data) {
//            if (value > max) {
//                max = value;
//            }
//        }
//        System.out.println("Max value found:" + max);
//
//        int count = Runtime.getRuntime().availableProcessors();
//        System.out.println("num of processor:" + count);
//
//        ForkJoinPool pool = new ForkJoinPool();
//        FindMaxTask task = new FindMaxTask(data, 0, data.length-1, data.length/16);
//        Integer result = pool.invoke(task);
//        System.out.println("Max value found:" + result);
        
    }
}
