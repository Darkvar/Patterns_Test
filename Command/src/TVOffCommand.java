/**
 * Created with IntelliJ IDEA.
 * Date: 12.06.13
 *
 * @author: mkalachyov
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
