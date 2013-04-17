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
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasureemnts(15, 65, 30.4f);
    }
}
