/**
 * Created with IntelliJ IDEA.
 * Date: 03.06.13
 *
 * @author: mkalachyov
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
