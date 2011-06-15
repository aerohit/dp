public class ChicagoStyleIngredientFactory implements PizzaIngredientFactory {
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Clams createClams() {
		return new FrozenClams();
	}

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

}
