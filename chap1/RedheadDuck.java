public class RedheadDuck extends Duck implements Flyable, Quackable {
    public void quack() {
	System.out.println("Quacks like a duck");
    }
    public void fly() {
	System.out.println("Flies like a duck");
    }
    public void display() {
	System.out.println("Looks like a RedheadDuck");
    }
    public static void main(String [] args) {
	RedheadDuck duck = new RedheadDuck();
	duck.display();
	duck.quack();
	duck.swim();
	duck.fly();
    }
}
