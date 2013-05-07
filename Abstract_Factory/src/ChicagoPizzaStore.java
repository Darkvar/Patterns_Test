/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type){
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Calm Pizza");
                break;
        }
        return pizza;
    }
}
