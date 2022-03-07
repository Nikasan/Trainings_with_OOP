package design_patterns.decorator;

/**
 * Created by Nikasan
 */
public class DoDoPizza {

    public static void main(String[] args) {
        Pizza pizza1 = new ThickPizza();
        pizza1 = new Cheese(pizza1);
        pizza1 = new Cheese(pizza1);
        pizza1 = new Olives(pizza1);
        System.out.println(pizza1.getDescription() + ", Total price:" + pizza1.cost());

        Pizza pizza2 = new ThinPizza();
        pizza2 = new Olives(pizza2);
        pizza2 = new Olives(pizza2);
        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription() + ", Total price:" + pizza2.cost());
    }

}
