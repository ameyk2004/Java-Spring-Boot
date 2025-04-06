package AdvanceJava.L02_Interfaces;

interface Computer{
    void code();
}

class Laptop implements Computer{

    public void code(){
        System.out.println("Coding with Laptop");
    }
}

class Desktop implements Computer{

    public void code(){
        System.out.println("Coding with Desktop");
    }
}

class Developer{

    public void work(Computer comp){
        comp.code();
    }
}


public class Main {
    public static void main(String[] args) {
        Developer ameyDeveloper = new Developer();
        Computer mackbook = new Laptop();
        ameyDeveloper.work(mackbook);
    }
}
