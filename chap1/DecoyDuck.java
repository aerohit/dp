public class DecoyDuck extends Duck {
    public void display() {
	System.out.println("Looks like a DecoyDuck");
    }
    public void fly() {
	// Do nothing.
    }
    public void quack() {
	// Do nothing.
    }
    public static void main(String [] args) {
	DecoyDuck duck = new DecoyDuck();
	duck.quack();
	duck.swim();
	duck.display();
	duck.fly();
    }
}
