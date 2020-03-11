package lab7_interfaces_Java8.prob4;

public class RedheadDuck extends DuckAbstractClass {
	
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	
	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
