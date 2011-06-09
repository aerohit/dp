public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    public Duck() {
    }
    public void performFly() {
    	flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void performQuack() {
    	quackBehavior.quack();
    }
    public void swim() {
    	System.out.println("Swims like a duck");
    }
    public abstract void display();
}
