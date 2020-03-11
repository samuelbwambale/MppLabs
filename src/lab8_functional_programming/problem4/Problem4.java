package lab8_functional_programming.problem4;

import java.util.Arrays;
import java.util.List;

public class Problem4 {
	
	public int countWords(List<String> words, char c, char d, int len) {
		return 
			(int) words.stream()   //convert list to stream
		 .filter(word -> !word.contains("" + d)) // filter words that do not contain char d
		 .filter(word -> word.contains("" + c)) // filter words that contain char c
		 .filter(word -> word.length() == len) // filter words of length len
//		     .forEach(word -> System.out.println(word));
		 .count();
	}


	public static void main(String[] args) {
		List<String> words = Arrays.asList("ac", "cd", "cc", "dd", "ca", "", "Scott");
		Problem4 obj = new Problem4();
		System.out.println(obj.countWords(words, 'c', 'd', 2));

	}

}
