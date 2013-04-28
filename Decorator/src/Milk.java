/**
 * Created with IntelliJ IDEA.
 * Date: 28.04.13
 *
 * @author: mkalachyov
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.25;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
