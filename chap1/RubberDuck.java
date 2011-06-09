public class RubberDuck extends Duck {
    public RubberDuck() {
    	setQuackBehavior(new Squeak());
    	setFlyBehavior(new FlyNoWay());
    }
	public void display() {
    	System.out.println("Looks like a RubberDuck");
    }
}
