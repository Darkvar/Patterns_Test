/**
 * Created with IntelliJ IDEA.
 * Date: 28.07.13
 *
 * @author: mkalachyov
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
