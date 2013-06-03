/**
 * Created with IntelliJ IDEA.
 * Date: 31.05.13
 *
 * @author: mkalachyov
 */
public class Light {

    String location = "";

    public Light(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " light is on");
    }
    public void off(){
        System.out.println(location + " light is off");
    }

}
