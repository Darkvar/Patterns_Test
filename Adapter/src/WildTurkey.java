/**
 * Created with IntelliJ IDEA.
 * Date: 17.06.13
 *
 * @author: mkalachyov
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
