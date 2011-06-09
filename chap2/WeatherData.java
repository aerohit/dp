import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private double temperature;
	private double pressure;
	private double humidity;
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public void setMeasurements(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(temperature, pressure, humidity);
		}
	}
}
