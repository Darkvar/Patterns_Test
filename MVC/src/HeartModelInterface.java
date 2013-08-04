/**
 * Created with IntelliJ IDEA.
 * Date: 04.08.13
 *
 * @author: mkalachyov
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
