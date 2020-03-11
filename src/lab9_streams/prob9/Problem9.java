package lab9_streams.prob9;

import java.util.stream.Stream;

public class Problem9 {

	public static void main(String[] args) {
				printSquares(5);

	}
	
	public static void printSquares(int num) {
		Stream<Integer> intStream = Stream.
				iterate(1, n -> (int) Math.pow(Math.sqrt(n)+1, 2)).limit(num);
		
		intStream.forEach(item -> System.out.print(item + " "));
	}


}
