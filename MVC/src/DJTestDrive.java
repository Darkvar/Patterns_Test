/**
 * Created with IntelliJ IDEA.
 * Date: 30.07.13
 *
 * @author: mkalachyov
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controllerInterface = new BeatController(model);
    }
}
