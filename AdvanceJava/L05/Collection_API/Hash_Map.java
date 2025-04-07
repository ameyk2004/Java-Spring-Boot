package AdvanceJava.L05.Collection_API;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {

    public static void main(String args[]){

        Map<String, String> myMap = new HashMap<String, String>();

        myMap.put("Amey", "Boy");
        myMap.put("Shraddha", "Girl");
        myMap.put("Aditya", "Boy");
        myMap.put("Anushka", "Girl");

        System.out.println(myMap);

        System.out.println(myMap.keySet());

        for(String key: myMap.keySet()){

            System.out.println(key+" : "+myMap.get(key));
        }


    }
}
