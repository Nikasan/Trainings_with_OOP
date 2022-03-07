package design_patterns.factory;

/**
 * Created by Nikasan
 */
public class NYMashroomPizza extends Pizza{

    String name = "NYMashroomPizza";


    @Override
    String getName() {
        return name;
    }

    @Override
    void prepare() {
        System.out.println("Preparation NYMashroomPizza");
    }

    @Override
    void bake() {
        System.out.println("Baking NYMashroomPizza");
    }

    @Override
    void cut() {
        System.out.println("Cutting NYMashroomPizza");
    }

    @Override
    void box() {
        System.out.println("Boxing NYMashroomPizza");
    }
}
