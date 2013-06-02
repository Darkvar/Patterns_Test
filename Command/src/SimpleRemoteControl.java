/**
 * Created with IntelliJ IDEA.
 * Date: 31.05.13
 *
 * @author: mkalachyov
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
