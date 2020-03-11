package lab7_interfaces_Java8.prob4;

public class CannotFly implements FlyBehaviorInterface {

	@Override
	public void fly() {
		System.out.println("  cannot fly");
	}

}
