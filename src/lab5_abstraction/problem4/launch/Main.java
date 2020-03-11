package lab5_abstraction.problem4.launch;

import java.time.LocalDate;

import lab5_abstraction.problem4.*;




public class Main {
	public static void main(String[] args) {
		
		Customer cust = CustOrderFactory.newCustOrderFactory("John Doe", LocalDate.now());
		cust.getOrders().get(0).addItem("Shirt");
		cust.getOrders().get(0).addItem("Pants");

		System.out.println(cust.getOrders());
	}
}

		
