package AdvanceJava.L05.Collection_API;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println(list);

        for(int n : list){
            System.out.println(n);
        }

        System.out.println(list.get(2));




    }
}
