package AdvanceJava.L05.Collection_API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Java_Comparator {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>();

        Comparator<Integer> com =(o1,o2) -> {
                if(o1%10 > o2%10)
                    return -1;
                else return 1;
        };

        myList.add(42);
        myList.add(70);
        myList.add(85);
        myList.add(46);
        myList.add(94);
        myList.add(63);

        myList.sort(com);

        System.out.println(myList);


    }
}
