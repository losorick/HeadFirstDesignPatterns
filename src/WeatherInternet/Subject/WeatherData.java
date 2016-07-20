package WeatherInternet.Subject;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by loso on 2016/7/20.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;
    private ArrayList observers;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public WeatherData() {
    }



}

