package oopTraining;

public class Nissan implements MegaCar{
     static final int y =8;

    @Override
    public void drive() {
        System.out.println("I am nissan!");
    }

    public void kadmfkm(String s) {
        System.out.println("I am overloaded" +s);
    }

}
