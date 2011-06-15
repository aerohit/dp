public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName());
	}
}
