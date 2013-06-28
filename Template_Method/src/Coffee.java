/**
 * Created with IntelliJ IDEA.
 * Date: 28.06.13
 *
 * @author: mkalachyov
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through the filter");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
