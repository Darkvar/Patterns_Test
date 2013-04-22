import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * Date: 22.04.13
 *
 * @author: mkalachyov
 */
public class WeatherData extends Observable {
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
