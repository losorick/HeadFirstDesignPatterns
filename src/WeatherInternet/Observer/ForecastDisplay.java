package WeatherInternet.Observer;

import WeatherInternet.Subject.WeatherData;
import WeatherInternet.inter.DisPlayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by loso on 2016/7/20.
 */
public class ForecastDisplay implements Observer, DisPlayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("pressure change : " + currentPressure);
    }
}
