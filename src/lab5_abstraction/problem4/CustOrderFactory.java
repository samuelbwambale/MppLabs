package lab5_abstraction.problem4;

import java.time.LocalDate;
import java.util.ArrayList;

public class CustOrderFactory {
	
	private CustOrderFactory() {}
	
	public static Customer newCustOrderFactory(String name,  LocalDate date) {
		Customer cust = new Customer(name);
		Order order = new Order(LocalDate.now());
		cust.addOrder(order);
		return cust;
		
	}

	

	
}
