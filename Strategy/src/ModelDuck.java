/**
 * Created with IntelliJ IDEA.
 * Date: 15.04.13
 * @author: mkalachyov
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a toy duck !");
    }
}
