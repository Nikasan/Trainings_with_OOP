package oopTraining;

public class Mazda extends Car {

    Mazda(){
        System.out.println("mazda constructor");
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
