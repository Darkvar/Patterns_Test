/**
 * Created with IntelliJ IDEA.
 * Date: 24.05.13
 *
 * @author: mkalachyov
 */
public class SyncSingleton {
    private static SyncSingleton instance;

    private SyncSingleton(){}

    public static synchronized SyncSingleton getInstance(){
        if (instance == null){
            instance = new SyncSingleton();
        }
        return instance;
    }
}
