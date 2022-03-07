package design_patterns.factory;

/**
 * Created by Nikasan
 */
public class NYCheesePizza extends Pizza{

    private String name = "NYCheesePizza";

    @Override
    String getName() {
        return name;
    }

    @Override
    void prepare() {
        System.out.println("Preparation NYCheesePizza");
    }

    @Override
    void bake() {
        System.out.println("Baking NYCheesePizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting NYCheesePizza");
    }

    @Override
    void box() {
        System.out.println("Boxing NYCheesePizza");
    }
}
