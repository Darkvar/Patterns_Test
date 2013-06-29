/**
 * Created with IntelliJ IDEA.
 * Date: 29.06.13
 *
 * @author: mkalachyov
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("Making Tea");
        teaHook.prepareRecipe();

        System.out.println("Making Coffee");
        coffeeHook.prepareReceipe();
    }
}
