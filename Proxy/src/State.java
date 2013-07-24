/**
 * Created with IntelliJ IDEA.
 * Date: 21.07.13
 *
 * @author: mkalachyov
 */
import java.io.*;

public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCranck();
    public void dispense();
}

