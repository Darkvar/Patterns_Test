/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (type){
            case CHEESE:
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
        }
        return pizza;
    }
}
