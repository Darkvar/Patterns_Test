/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type){
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            default:
                return null;
        }
    }
}
