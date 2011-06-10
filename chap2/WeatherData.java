import java.util.Observable;

public class WeatherData extends Observable {
	private double temperature;
	private double pressure;
	private double humidity;
	
	public double getTemperature() {
		return temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setMeasurements(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

}
