/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;

        switch (type){
            case CHEESE:
                pizza = new CheesePizza();
                break;
            case VEGGIE:
                pizza = new VeggiePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
