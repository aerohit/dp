public class MallardDuck extends Duck implements Flyable, Quackable {
    public void quack() {
	System.out.println("Quacks like a duck");
    }
    public void fly() {
	System.out.println("Flies like a duck");
    }
    public void display() {
	System.out.println("Looks like a MallardDuck");
    }
    public static void main(String [] args) {
	MallardDuck duck = new MallardDuck();
	duck.display();
	duck.quack();
	duck.swim();
	duck.fly();
    }
}
