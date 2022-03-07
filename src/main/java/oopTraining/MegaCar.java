package oopTraining;

public interface MegaCar {


abstract void drive();

public static void interfaceMethod(){
    System.out.println("MegaCar: public static void interfaceMethod()");
}
public default void test(){
    System.out.println("say hello");
}
}
