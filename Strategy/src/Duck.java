/**
 * Created with IntelliJ IDEA.
 * Date: 15.04.13
 * @author: mkalachyov
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour fb){
        this.flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        this.quackBehaviour = qb;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

}
