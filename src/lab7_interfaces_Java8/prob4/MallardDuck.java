package lab7_interfaces_Java8.prob4;

public class MallardDuck extends DuckAbstractClass {
	
	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("  displaying");
	}

}
