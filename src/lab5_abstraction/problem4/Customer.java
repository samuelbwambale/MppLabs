package lab5_abstraction.problem4;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	public Customer(String name) {
		this.name = name;
			
	}
	public void addOrder(Order order) {
		orders.add(order);
	}
	public String getName() {
		return name;
	}
	public List<Order> getOrders() {
		return orders;
	}
}
