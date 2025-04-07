package AdvanceJava.L06_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API_In_Java {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,5,6);

        int answer = myList.stream()
                    .filter(n->n%2 == 0)
                    .map(n -> n*2)
                    .reduce(0, (c,e) -> c+e);

        System.out.println(answer);
    }
}
