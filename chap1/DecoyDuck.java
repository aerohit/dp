public class DecoyDuck extends Duck {
    public DecoyDuck() {
    	setQuackBehavior(new MuteQuack());
    	setFlyBehavior(new FlyNoWay());
    }
	public void display() {
    	System.out.println("Looks like a DecoyDuck");
    }
}
