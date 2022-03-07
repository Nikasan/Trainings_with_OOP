package design_patterns.decorator;

/**
 * Created by Nikasan
 */
public class Cheese extends Decorator {

    Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return pizza.cost() + 1.5;
    }
}
