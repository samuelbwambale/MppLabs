package lab4_interaction_diagrams.lab4C;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Order> empOrders = Arrays.asList(new Order(1, LocalDate.now(), 20000),
				new Order(2, LocalDate.now(), 30000));
		
		List<Employee> employees = Arrays.asList(
				new Hourly(50, 40, "001"),
				new Salaried(5000, "002"),
				new Commissioned(0.1, 3000, empOrders, "003")
				);
		
		for(Employee emp : employees) {
			double netPay = emp.calcCompensantion(1, 2020).getNetPay();
			System.out.println("Employee " + emp.getClass().getSimpleName() + " net pay is: " + netPay);
		}
		
	}

}
