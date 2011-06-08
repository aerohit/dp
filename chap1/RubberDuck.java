public class RubberDuck extends Duck implements Quackable {
    public void quack() {
	System.out.println("Quacks like a duck");
    }
    public void display() {
	System.out.println("Looks like a RubberDuck");
    }
    public static void main(String [] args) {
	RubberDuck duck = new RubberDuck();
	duck.display();
	duck.quack();
	duck.swim();
    }
}
