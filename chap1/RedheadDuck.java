public class RedheadDuck extends Duck {
	public RedheadDuck() {
		setQuackBehavior(new Quack());
    	setFlyBehavior(new FlyWithWings());
	}
    public void display() {
    	System.out.println("Looks like a RedheadDuck");
    }
}
