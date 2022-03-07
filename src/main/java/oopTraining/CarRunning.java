package oopTraining;

public class CarRunning {
    public static void main(String[] args) {
//        Car opel = new Opel();
//        opel.drive();
//        Car mazda = new Mazda();
//        Car mazdaCX6 = new MazdaSX6();
//        MazdaSX6 mazdaCX = new MazdaSX6();
//
        Outputter out = new Outputter();
        MegaCar car =  new MiniScoda();
        out.megaTest(car);

//        out.logdrive(opel);
//        out.logdrive(mazda);
//        out.logdrive(mazdaCX6);
//
//       mazdaCX.superThis();
//        System.out.println(opel.getBeep("beep"));
//        MegaCar.interfaceMethod();
        Nissan nissan = new Nissan();

        nissan.drive();
    }

}
