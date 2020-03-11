package lab4_interaction_diagrams.lab4C;

import java.time.Month;
import java.time.Year;

public abstract class Employee {
	private String empId;
	
	Employee(String empId) {
		this.empId = empId;
	}
	
	public Paycheck calcCompensantion(int month, int year) {
		Paycheck paycheck = new Paycheck(calcGrossPay(month, year));
		return paycheck;
		
	}
	
	abstract double calcGrossPay(int month, int year);
}
