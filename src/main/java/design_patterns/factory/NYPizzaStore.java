package design_patterns.factory;

/**
 * Created by Nikasan
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYCheesePizza();
        } else if (item.equals("mashroom")) {
            return new NYMashroomPizza();
        } else {
            return null;
        }
    }
}
