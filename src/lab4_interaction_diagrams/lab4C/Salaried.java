package lab4_interaction_diagrams.lab4C;

import java.time.Month;
import java.time.Year;

public class Salaried extends Employee {
	private double salary;
	
	Salaried(double salary,  String empId) {
		super(empId);
		this.salary = salary;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return salary;
	}
	
	

}
