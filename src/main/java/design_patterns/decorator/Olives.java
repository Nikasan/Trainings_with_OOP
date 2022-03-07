package design_patterns.decorator;

/**
 * Created by Nikasan
 */
public class Olives extends Decorator {

    Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }

    public double cost() {
        return pizza.cost() + 0.7;
    }
}
