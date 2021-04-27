package oopTraining;

public  abstract class Car {
    Car(){
        System.out.println("car output");
    }
    public String getBeep() {
        return beep;
    }

    private String beep;
    abstract void drive();
}

//    Если говорить кратко, полиморфизм — это способность обьекта использовать методы производного класса,
//    который не существует на момент создания базового.
