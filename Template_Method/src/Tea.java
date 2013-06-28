/**
 * Created with IntelliJ IDEA.
 * Date: 28.06.13
 *
 * @author: mkalachyov
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
