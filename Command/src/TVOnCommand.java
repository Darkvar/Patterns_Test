/**
 * Created with IntelliJ IDEA.
 * Date: 31.05.13
 *
 * @author: mkalachyov
 */
public class TVOnCommand implements Command {

    TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setChannel();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
