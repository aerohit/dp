public class DecoyDuck extends Duck {
    public void display() {
	System.out.println("Looks like a DecoyDuck");
    }
    public static void main(String [] args) {
	DecoyDuck duck = new DecoyDuck();
	duck.display();
	duck.swim();
    }
}
