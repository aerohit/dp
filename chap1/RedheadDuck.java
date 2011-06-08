public class RedheadDuck extends Duck {
    public void display() {
	System.out.println("Looks like a RedheadDuck");
    }
    public static void main(String [] args) {
	RedheadDuck duck = new RedheadDuck();
	duck.quack();
	duck.swim();
	duck.display();
	duck.fly();
    }
}
