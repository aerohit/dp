import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	private double temperature;
	private double pressure;
	private double humidity;
	Observable weatherData;
	
	public StatisticsDisplay(Observable weatherData) {
//		this.weatherData = weatherData;
		weatherData.addObserver(this);
	}
	
	public void display() {
		System.out.println("##################################");
		System.out.println("Statistics display");
		System.out.println("Temperature " + temperature);
		System.out.println("Pressure " + pressure);
		System.out.println("Humidity " + humidity);
		System.out.println("##################################");
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}
