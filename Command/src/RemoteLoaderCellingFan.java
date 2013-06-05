/**
 * Created with IntelliJ IDEA.
 * Date: 03.06.13
 *
 * @author: mkalachyov
 */
public class RemoteLoaderCellingFan {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        CellingFan cellingFan = new CellingFan("Living Room");

        CellingFanMediumCommand cellingFanMedium = new CellingFanMediumCommand(cellingFan);
        CellingFanHighCommand cellingFanHigh = new CellingFanHighCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);

        remoteControl.setCommand(0, cellingFanMedium, cellingFanOff);
        remoteControl.setCommand(1, cellingFanHigh, cellingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
