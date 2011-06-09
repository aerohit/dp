public class StatisticsDisplay implements Observer, DisplayElement {
	private double temperature;
	private double pressure;
	private double humidity;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(double temperature, double pressure, double humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("**********************************");
		System.out.println("Statistics display");
		System.out.println("Temperature " + temperature);
		System.out.println("Pressure " + pressure);
		System.out.println("Humidity " + humidity);
		System.out.println("**********************************");
	}
}
