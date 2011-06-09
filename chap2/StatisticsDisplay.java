public class StatisticsDisplay {
	private float temperature;
	private float pressure;
	private float humidity;
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}
}
