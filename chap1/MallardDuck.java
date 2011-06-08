public class MallardDuck extends Duck {
    public void display() {
	System.out.println("Looks like a MallardDuck");
    }
    public static void main(String [] args) {
	MallardDuck duck = new MallardDuck();
	duck.quack();
	duck.swim();
	duck.display();
    }
}
