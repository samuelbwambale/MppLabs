package lab8_functional_programming.problem6;
import java.util.function.BiFunction;
import java.util.function.Function;


@FunctionalInterface
interface TestInterface{
	void setname(Employee e, String s);
}

public class Examples {
	
	
	//type: Class::instanceMethod
	static Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	
	 //A (Employee e) -> e.getName();
	Function<Employee, String> name = (Employee e) -> e.getName();
	Function<Employee, String> name2 = Employee::getName;
	// Method reference type: Class::instanceMethod

		
	// B. (Employee e,String s) -> e.setName(s)
	TestInterface sname = (Employee e, String s) -> e.setName(s);
	TestInterface sname2 = Employee::setName;
	// Method reference type: Class::instanceMethod
	
	//	C. (String s1,String s2) -> s1.compareTo(s2)
	BiFunction<String, String, Integer> comparator = (String s1, String s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> comparator2 = String::compareTo;
	// Method reference type: Class::staticMethod
	
	//	D. (Integer x,Integer y) -> Math.pow(x,y)
	BiFunction<Integer, Integer, Double> pow = (x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> pow2 = Math::pow;
	// Method reference type: Class::staticMethod
	
	//	E. (Apple a) -> a.getWeight()
	Function<Apple, Double> getter = (Apple a) -> a.getWeight();
	Function<Apple, Double> getter2 = Apple::getWeight;
	// Method reference type: Class::instanceMethod
	
	
	//	F. (String x) -> Integer.parseInt(x);
	Function<String, Integer> parser = (String x) -> Integer.parseInt(x);
	Function<String, Integer> parser2 = Integer::parseInt;
	// Method reference type: Class::staticMethod
	
	
	
	public void evaluator() {
		System.out.println(upper2.apply("hello"));
		System.out.println(pow.apply(2, 2));
		System.out.println(Integer.parseInt("2"));
		System.out.println(upper1.apply("rest"));
		System.out.println(comparator.apply("Abba", "Bob"));
		
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
}
