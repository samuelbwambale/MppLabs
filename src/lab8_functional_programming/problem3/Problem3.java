package lab8_functional_programming.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Problem3 {

	final BiFunction<Double, Double, List<Double>> biFunction = (x,y) -> {
		List<Double> list = new ArrayList<>();
		list.add(Math.pow(x,y));
		list.add(x * y);
		return list;
	};
	
	
		
	public static void main(String[] args) {
		
		Problem3 obj = new Problem3();
		System.out.println(obj.biFunction.apply(2.0, 3.0));



	}

}
