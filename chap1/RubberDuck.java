public class RubberDuck extends Duck {
    public void display() {
	System.out.println("Looks like a RubberDuck");
    }
    public void fly() {
	// Do nothing.
    }
    public static void main(String [] args) {
	RubberDuck duck = new RubberDuck();
	duck.quack();
	duck.swim();
	duck.display();
	duck.fly();
    }
}