package lab7_interfaces_Java8.prob4;

public abstract class DuckAbstractClass {
	FlyBehaviorInterface flyBehavior;
	QuackBehaviorInterface quackBehavior;
	
	public DuckAbstractClass() {
	}
	
	public abstract void display();
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("  swimming");
	}
}
