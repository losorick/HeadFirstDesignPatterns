package PizzaStore;

import PizzaStore.Store.CGPizzaStore;
import PizzaStore.Store.PizzaStore;
import PizzaStore.Pizza.Pizza;
import PizzaStore.Store.NYPizzaStore;

/**
 * Created by loso on 2016/7/22.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chivagoStore = new CGPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza1 = chivagoStore.orderPizza("cheese");
        System.out.println("Joel ordereed a " + pizza1.getName() + "\n");
    }
}
