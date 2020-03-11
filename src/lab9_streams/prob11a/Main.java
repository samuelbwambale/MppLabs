package lab9_streams.prob11a;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		System.out.println(/*implement */
				  emps
				  .stream()
				  .filter(emp -> emp.getSalary() > 100000 && emp.getLastName().charAt(0) > 'M' )
				  .sorted(Comparator.comparing((Employee emp) -> emp.getFirstName()))
				  .map(emp -> emp.getFirstName() + " " + emp.getLastName())
				  .collect(Collectors.joining(", "))
				  );
				               
		  

	}
	
	
	

}
