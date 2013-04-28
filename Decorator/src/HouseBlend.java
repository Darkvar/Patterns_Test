/**
 * Created with IntelliJ IDEA.
 * Date: 28.04.13
 *
 * @author: mkalachyov
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
