package PizzaStore.Ingredient;

/**
 * Created by loso on 2016/7/22.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce creatSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese creatCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
