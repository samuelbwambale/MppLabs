package lab7_interfaces_Java8.prob4;

public class MuteQuack implements QuackBehaviorInterface {

	@Override
	public void quack() {
		System.out.println("  cannot quack");
	}

}
