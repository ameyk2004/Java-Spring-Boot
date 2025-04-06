package AdvanceJava.L03_Enums;

enum Status{
    Running, Success, Failed
}

public class Main {

    public static void main(String[] args) {

        Status[] allStatus = Status.values();

        for(Status s : allStatus){
            System.out.println(s);
        }
    }
    
}
