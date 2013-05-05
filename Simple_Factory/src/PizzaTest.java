/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */
public class PizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
    }
}
