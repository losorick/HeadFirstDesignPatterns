package WeatherInternet.Observer;

import WeatherInternet.Subject.WeatherData;
import WeatherInternet.inter.DisPlayElement;

import java.util.Observer;
import java.util.Observable;

/**
 * Created by loso on 2016/7/20.
 */
public class CurrentConditionsDisplay implements Observer, DisPlayElement {
    private float temperature;
    private float humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
