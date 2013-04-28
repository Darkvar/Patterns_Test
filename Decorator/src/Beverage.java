/**
 * Created with IntelliJ IDEA.
 * Date: 28.04.13
 *
 * @author: mkalachyov
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
