/**
 * Created with IntelliJ IDEA.
 * Date: 07.05.13
 *
 * @author: mkalachyov
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createCalms();
}
