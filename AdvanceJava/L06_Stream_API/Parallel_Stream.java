package AdvanceJava.L06_Stream_API;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

public class Parallel_Stream {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        int size = 1000;

        Random ran = new Random();

        for(int i=0;i<size;i++){
            nums.add(ran.nextInt(1000));
        }

        long startSeq = System.currentTimeMillis();

        int sum1 = nums.stream()
                .mapToInt(n -> n*2)
                .sum();

        long endSeq = System.currentTimeMillis();

        long startParallel = System.currentTimeMillis();

        int sum2 = nums.parallelStream()
                .mapToInt(n -> n*2)
                .sum();

        long endParallel = System.currentTimeMillis();

        long seqDur = endSeq - startSeq;
        long parDur = endParallel - startParallel;


        System.out.println(sum1 + " " + sum2);

        System.out.println("Sequential Duration " + seqDur);
        System.out.println("Parallel Duration " + parDur);
    }
}
