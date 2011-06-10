public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionsDisplay(weatherData);
		new StatisticsDisplay(weatherData);
		new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(26.0, 88, 30);
		weatherData.setMeasurements(24.0, 95.0, 40.0);
		weatherData.setMeasurements(29.0, 79.4, 50);
	}
}
