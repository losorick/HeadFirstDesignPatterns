package WeatherInternet.test;

import WeatherInternet.Observer.CurrentConditionsDisplay;
import WeatherInternet.Observer.ForecastDisplay;
import WeatherInternet.Observer.HeatIndexDisplay;
import WeatherInternet.Subject.WeatherData;

/**
 * Created by loso on 2016/7/20.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65, 30.4f);
        weatherData.setMeasurements(82,70, 29.2f);
        weatherData.setMeasurements(78,90, 29.2f);
    }
}
