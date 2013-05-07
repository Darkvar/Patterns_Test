/**
 * Created with IntelliJ IDEA.
 * Date: 05.05.13
 *
 * @author: mkalachyov
 */

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("First order " + pizza.getName() + "\n");
    }
}
