/**
 * Created with IntelliJ IDEA.
 * Date: 16.04.13
 *
 * @author: mkalachyov
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(15, 65, 20);
    }
}
