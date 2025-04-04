package AdvanceJava.L01_Annonymous_and_Abstract_Inner_Class;
abstract class A{
    public abstract void show();
}

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            public void show(){
                System.out.println("In Annonymous Abstract class");
            }
        };

        obj.show();
    }
}
