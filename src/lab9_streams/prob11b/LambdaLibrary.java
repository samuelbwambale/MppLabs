package lab9_streams.prob11b;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaLibrary {
	
	public static final TriFunction<List<Employee>, Integer, Character, String> EMPLOYEE_NAMES = 
			(list, amount, letter) -> list
			  .stream()
			  .filter(emp -> emp.getSalary() > amount && emp.getLastName().charAt(0) > letter )
			  .sorted(Comparator.comparing((Employee emp) -> emp.getFirstName()))
			  .map(emp -> emp.getFirstName() + " " + emp.getLastName())
			  .collect(Collectors.joining(", "));

	public static char[] EMPLOYEE_NAMES(List<Employee> list, int i, char c) {
		// TODO Auto-generated method stub
		return null;
	}
			
}
