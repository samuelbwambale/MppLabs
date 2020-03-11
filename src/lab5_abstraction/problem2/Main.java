package lab5_abstraction.problem2;

// Helpful resource: https://www.oreilly.com/library/view/head-first-design/0596007124/ch01.html

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {
				new MallardDuck(),
				new DecoyDuck(),
				new RedheadDuck(),
				new RubberDuck()
		};
		for(Duck duck : ducks) {
			System.out.println(duck.getClass().getSimpleName() + ":");
			duck.display();
			duck.fly();
			duck.quack();
			duck.swim();
		}

	}

}
