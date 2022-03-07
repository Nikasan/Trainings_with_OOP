package oopTraining;

public class Mazda extends Car {
final int fuel;

    Mazda(){
        System.out.println("mazda constructor");
        fuel = 45;
    }
    private String sound = "I am mazda";

    public String getSound() {
        return sound;
    }

    public void setSound(String newValue){
        this.sound = newValue;
    }


    public void drive() {
        System.out.println(sound);
    }
}
