package OOPbyMemory;

public class Runner {
    public static void main(String[] args) {
        CarDriving drive = new CarDriving();
        Car opel = new Opel();
        Car audi = new Audi();


        drive.driving(opel);
        drive.driving(audi);
    }
}
