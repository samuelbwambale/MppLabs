package lab5_abstraction.problem2;

public class RedheadDuck extends Duck {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
