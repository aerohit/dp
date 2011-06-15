public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Clams createClams() {
		return new FreshClams();
	}

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

}
