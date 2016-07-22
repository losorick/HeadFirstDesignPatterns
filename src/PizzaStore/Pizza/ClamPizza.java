package PizzaStore.Pizza;

import PizzaStore.Ingredient.PizzaIngredientFactory;

/**
 * Created by loso on 2016/7/22.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.creatSauce();
        cheese = ingredientFactory.creatCheese();
        clam = ingredientFactory.createClam();
    }
}
