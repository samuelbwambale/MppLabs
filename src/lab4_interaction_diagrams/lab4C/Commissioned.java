package lab4_interaction_diagrams.lab4C;

import java.util.List;

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> empOrders;
	
	public Commissioned(double commission, double baseSalary, List<Order> empOrders, String empId) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.empOrders = empOrders;
		
	}
	

	@Override
	double calcGrossPay(int month, int year) {
		double totalOrderAmount = 0;
		for(Order order : empOrders) {
			if ((order.getOrderDate().getMonth().getValue() == month) 
					&& (order.getOrderDate().getYear() == year)) {
				totalOrderAmount += order.getOrderAmount();
			}
		}
		return baseSalary + (this.commission * totalOrderAmount);
	}
	
	

}
