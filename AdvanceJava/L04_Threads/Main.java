package AdvanceJava.L04_Threads;

class A extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=0;i<100;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {

    public  static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }


}
