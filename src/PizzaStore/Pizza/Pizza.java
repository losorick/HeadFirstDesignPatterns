package PizzaStore.Pizza;

import PizzaStore.Ingredient.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by loso on 2016/7/22.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;


    ArrayList toppings = new ArrayList();

    public abstract void prepare();

//    {
//        System.out.println("Preparing " + name);
//        System.out.println("Tossing dough...");
//        System.out.println("Adding toppings: ");
//        for (Object topping : toppings) {
//            System.out.println("    " + topping);
//        }
//    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    };
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    };
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    };

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                ", toppings=" + toppings +
                '}';
    }
}
