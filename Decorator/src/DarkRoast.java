/**
 * Created with IntelliJ IDEA.
 * Date: 28.04.13
 *
 * @author: mkalachyov
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
