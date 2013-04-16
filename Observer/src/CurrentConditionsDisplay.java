/**
 * Created with IntelliJ IDEA.
 * Date: 16.04.13
 *
 * @author: mkalachyov
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current conditions are : " + temp + " C and " + humidity + " % humidity");
    }
}
