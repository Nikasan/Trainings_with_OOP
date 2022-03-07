package design_patterns.decorator;

/**
 * Created by Nikasan
 */
public class ThickPizza extends Pizza {

    public ThickPizza() {
        description = "Thick pizza";
    }

    public double cost() {
        return 15;
    }
}
