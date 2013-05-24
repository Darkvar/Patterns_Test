/**
 * Created with IntelliJ IDEA.
 * Date: 23.05.13
 *
 * @author: mkalachyov
 */
public class Singleton {
    private static  Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
