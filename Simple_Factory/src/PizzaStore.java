/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}


