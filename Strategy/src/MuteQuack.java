/**
 * Created with IntelliJ IDEA.
 * Date: 15.04.13
 * @author: mkalachyov
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
