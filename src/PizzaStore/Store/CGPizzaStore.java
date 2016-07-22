package PizzaStore.Store;

import PizzaStore.Ingredient.NYPizzaIngredientFactory;
import PizzaStore.Ingredient.PizzaIngredientFactory;
import PizzaStore.Pizza.CheesePizza;
import PizzaStore.Pizza.Pizza;

/**
 * Created by loso on 2016/7/22.
 */
public class CGPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item){
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    if(item.equals("cheese")){
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
    }
////        else if(item.equals("veggil")){
////            return new CGStyleVegglePizza();
////        }else if(item.equals("clam")){
////            return new CGStyleClamPizza();
////        }else if(item.equals("pepperoni")){
////            return new CGStylePepperoniPizza();
////        }
//        else
        return pizza;
    }

}
