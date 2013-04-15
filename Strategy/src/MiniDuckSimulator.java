/**
 * Created with IntelliJ IDEA.
 * Date: 15.04.13
 * @author: mkalachyov
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyWithRocketPower());
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setQuackBehaviour(new MuteQuack());
        modelDuck.performQuack();
    }
}
