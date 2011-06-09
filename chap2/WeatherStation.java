public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay sd = new StatisticsDisplay(weatherData);
		ForecastDisplay fd = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(26.0, 88, 30);
		weatherData.setMeasurements(24.0, 95.0, 40.0);
		weatherData.setMeasurements(29.0, 79.4, 50);
	}
}
