package lab7_interfaces_Java8.prob4;

public class DecoyDuck extends DuckAbstractClass {
	
	public DecoyDuck() {
		flyBehavior = new CannotFly();
		quackBehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("  displaying");
		
	}

}
