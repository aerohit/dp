public class WeatherData {
	private CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
	private StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
	private ForecastDisplay forecastDisplay = new ForecastDisplay();
	
	public float getTemperature() {
		return 0;
	}
	public float getHumidity() {
		return 0;
	}
	public float getPressure() {
		return 0;
	}
	public void measurementsChanged() {
		float temperature = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		currentConditionsDisplay.update(temperature, pressure, humidity);
		statisticsDisplay.update(temperature, pressure, humidity);
		forecastDisplay.update(temperature, pressure, humidity);
	}
}
