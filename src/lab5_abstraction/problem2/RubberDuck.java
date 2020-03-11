package lab5_abstraction.problem2;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("  displaying");
		
	}

}
