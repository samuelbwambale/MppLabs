package lab8_functional_programming.problem1;

import java.util.function.Supplier;

public class Problem1B {
	
	public static void main(String[] args) {
		Supplier<Double> supplier = () -> Math.random();
		System.out.println(supplier.get());
		
		Problem1B problem1b = new Problem1B();
		Problem1BInner innerClass = problem1b.new Problem1BInner();
		System.out.println(innerClass.get());

	}
	
	class Problem1BInner implements Supplier<Double> {
		
		@Override
		public Double get() {
			return Math.random();
		}
		
	}

}
