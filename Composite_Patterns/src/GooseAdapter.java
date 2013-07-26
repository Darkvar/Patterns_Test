/**
 * Created with IntelliJ IDEA.
 * Date: 26.07.13
 *
 * @author: mkalachyov
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
