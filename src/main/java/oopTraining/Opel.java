package oopTraining;

public class Opel extends Car {

    private int fuel=40;


    public void drive() {
        System.out.println("Opel has " + fuel + " litres tank");
    }


    public void printBip(){
        System.out.println("BIP");
    }

    public void printBip(String bip){}
}
