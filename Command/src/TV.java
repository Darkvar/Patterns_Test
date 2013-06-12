/**
 * Created with IntelliJ IDEA.
 * Date: 12.06.13
 *
 * @author: mkalachyov
 */
public class TV {
    String location;
    int channel;

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " TV is on");
    }

    public void off(){
        System.out.println(location + " TV is off");
    }

    public void setChannel(){
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }
}
