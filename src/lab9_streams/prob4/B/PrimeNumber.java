package lab9_streams.prob4.B;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
	public static void main(String[] args) {
        
        List<Integer> s1 = printFirstNPrimes(10);
  		System.out.println(s1);
  		List<Integer> s2 = printFirstNPrimes(5);
  		System.out.println(s2);
    }
 

  
   static List<Integer> printFirstNPrimes(long n) {
	   return primes.limit(n).collect(Collectors.toList());
   }
    
  //Stream of natural numbers starting with 2
  	private static final Stream<Integer> naturalNumbers = Stream.iterate(2, n -> n+1);
  	
  	//Stream of all prime numbers
  	private static final Stream<Integer> primes = naturalNumbers.filter(PrimeNumber::isPrime);	
  	
  	 //Java 8 way to check if the number is prime or not 
    private static boolean isPrime(int number) {
        return number > 1 && IntStream
            .range(2, number)
            .noneMatch(i -> number % i == 0);
    }
  	


}
