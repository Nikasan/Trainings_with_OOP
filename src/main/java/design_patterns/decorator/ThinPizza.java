package design_patterns.decorator;

/**
 * Created by Nikasan
 */
public class ThinPizza extends Pizza {

    public ThinPizza() {
        description = "Thin pizza";
    }

    public double cost() {
        return 10;
    }
}
