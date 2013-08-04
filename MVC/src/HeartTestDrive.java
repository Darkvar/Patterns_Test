/**
 * Created with IntelliJ IDEA.
 * Date: 04.08.13
 *
 * @author: mkalachyov
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel model = new HeartModel();
        ControllerInterface controllerInterface = new HeartController(model);
    }
}
