package WeatherInternet.inter;

/**
 * Created by loso on 2016/7/20.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}

