public class ModelDuck extends Duck {
	public ModelDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyNoWay());
	}
	public void display() {
		System.out.println("Looks like a model duck");
	}

}
