/**
 * Created with IntelliJ IDEA.
 * Date: 31.05.13
 *
 * @author: mkalachyov
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
