/**
 * Created with IntelliJ IDEA.
 * Date: 17.04.13
 *
 * @author: mkalachyov
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    float temperature;
    float hIndex;
    float pressure;
    private Subject weatherData;

    public HeatIndexDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Current Heat Index is " + hIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        this.hIndex = pressure * temperature;
        display();
    }
}
