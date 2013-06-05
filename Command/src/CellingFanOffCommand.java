/**
 * Created with IntelliJ IDEA.
 * Date: 05.06.13
 *
 * @author: mkalachyov
 */
public class CellingFanOffCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanOffCommand(CellingFan cellingFan){
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case CellingFan.HIGH:
                cellingFan.high(); break;
            case CellingFan.MEDIUM:
                cellingFan.medium(); break;
            case CellingFan.LOW:
                cellingFan.low(); break;
            default:
                cellingFan.off(); break;
        }
    }
}
