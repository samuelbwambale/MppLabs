package lab4_interaction_diagrams.lab4C;

import java.time.Month;
import java.time.Year;

public class Hourly extends Employee {
	private double hourlyWage;
	private double hoursPerWeek;
	
	Hourly(double hourlyWage, double hoursPerWeek, String empId) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	double calcGrossPay(int month, int year) {
		return hourlyWage * hoursPerWeek * 4;
	}

}
