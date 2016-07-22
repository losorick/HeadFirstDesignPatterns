package PizzaStore.Ingredient;

/**
 * Created by loso on 2016/7/22.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce creatSauce();
    public Cheese creatCheese();
    public Veggies[] createVeggies();
    public Clams createClam();
}

