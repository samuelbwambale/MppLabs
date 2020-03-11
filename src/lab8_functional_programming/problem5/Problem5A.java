package lab8_functional_programming.problem5;

import java.util.Arrays;
import java.util.List;

public class Problem5A {



	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		list.forEach(word -> System.out.print(" " +word.toUpperCase()));
	}
}
