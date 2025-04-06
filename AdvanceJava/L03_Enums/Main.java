package AdvanceJava.L03_Enums;

enum Status{
    Running, Success, Failed
}

enum Laptop{
    Macbook(2000), XPS(2200), Thinkpad(800);

    Laptop(int price){
         this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

}

public class Main {

    public static void main(String[] args) {

        Status[] allStatus = Status.values();

        for(Status s : allStatus){
            System.out.println(s);
        }
        System.out.println("\n----------------------");
        System.out.println("Laptop Example\n");

        for(Laptop l : Laptop.values()){
            System.out.println("Name : "+l+"\tPrice : "+l.getPrice());
        }
    }
    
}
