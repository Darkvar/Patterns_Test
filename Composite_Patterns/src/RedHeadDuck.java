/**
 * Created with IntelliJ IDEA.
 * Date: 26.07.13
 *
 * @author: mkalachyov
 */
public class RedHeadDuck implements Quackable {
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
