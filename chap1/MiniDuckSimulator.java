public class MiniDuckSimulator {
    public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performQuack();
		mallard.performFly();
		Duck redhead = new RedheadDuck();
		redhead.display();
		redhead.swim();
		redhead.performQuack();
		redhead.performFly();
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.swim();
		rubber.performQuack();
		rubber.performFly();
		Duck decoy = new DecoyDuck();
		decoy.display();
		decoy.swim();
		decoy.performQuack();
		decoy.performFly();
		Duck model = new ModelDuck();
		model.display();
		model.swim();
		model.performQuack();
		model.performFly();
		System.out.println("*** Fly behavior changed at runtime.");
		model.setFlyBehavior(new FlyRockPowered());
		model.performFly();
    }
}
