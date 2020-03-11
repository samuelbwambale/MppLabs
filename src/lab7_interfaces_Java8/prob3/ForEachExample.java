package lab7_interfaces_Java8.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation",
				"Everywhere you want to be");

		// implement a Consumer
		Consumer<String> myConsumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t.toUpperCase() + " ");

			}

		};
		// print each element of the list in upper case format
		list.forEach(myConsumer);
	}
}