package lab7_interfaces_Java8.prob4;

public class RubberDuck extends DuckAbstractClass {
	
	public RubberDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new Squeak();
	}

	@Override
	public void display() {
		System.out.println("  displaying");
		
	}

}
