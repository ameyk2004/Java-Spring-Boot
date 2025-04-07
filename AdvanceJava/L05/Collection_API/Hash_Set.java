package AdvanceJava.L05.Collection_API;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hash_Set {

    public static void main(String args[]){

        // Unsorted
        Set<Integer> mySet = new HashSet<Integer>();

        mySet.add(54);
        mySet.add(43);
        mySet.add(35);
        mySet.add(-14);
        mySet.add(82);
        mySet.add(1);

        System.out.println("Non-Sorted Set (HashSet) : "+ mySet);

        // Unsorted
        Set<Integer> mySortedSet = new TreeSet<Integer>();

        mySortedSet.add(54);
        mySortedSet.add(43);
        mySortedSet.add(35);
        mySortedSet.add(-14);
        mySortedSet.add(82);
        mySortedSet.add(1);

        System.out.println("Sorted Set (TreeSet) : "+ mySortedSet);




    }
}
