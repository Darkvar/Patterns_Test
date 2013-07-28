/**
 * Created with IntelliJ IDEA.
 * Date: 28.07.13
 *
 * @author: mkalachyov
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
