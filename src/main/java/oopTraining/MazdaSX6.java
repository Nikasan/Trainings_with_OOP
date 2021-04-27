package oopTraining;

public class MazdaSX6 extends Mazda {
    MazdaSX6(){
        System.out.println("mazdaCX6 constructor");
    }

    @Override
    public void drive(){
        System.out.println("Mega MazdaZX6");
    }

    public void printFromCX6(){
        System.out.println();
    }
    public void superThis(){
        this.drive();
        super.drive();
    }
}
