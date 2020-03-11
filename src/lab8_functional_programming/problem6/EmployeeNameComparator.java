package lab8_functional_programming.problem6;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e1.getName().compareTo(e2.getName()) != 0)
			return e1.getName().compareTo(e2.getName());
		return e1.getSalary() < e2.getSalary() ? -1 : e1.getSalary() == e2.getSalary() ? 0 : 1;
	}

}
