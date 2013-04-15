/**
 * Created with IntelliJ IDEA.
 * Date: 15.04.13
 * @author: mkalachyov
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck !");
    }
}
