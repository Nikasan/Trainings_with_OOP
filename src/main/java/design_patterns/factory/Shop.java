package design_patterns.factory;

/**
 * Created by Nikasan
 */
public class Shop {

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println(pizza.getName());

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizzaM = pizzaStore.orderPizza("mashroom");
        System.out.println(pizzaM.getName());
    }

}
