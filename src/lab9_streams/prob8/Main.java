package lab9_streams.prob8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct1("Flowers"));
		
		System.out.println("Do any of these Order Items have an order of Tools? " + 
				   m.findProduct("Tools"));
	}
	
	private boolean findProduct1(String prodName) {
		for(OrderItem item : orderItems) {
			if(item != null) {
				Product p=item.getProduct();
				if(p != null) {
					String name = p.getProductName();
					if(name != null) {
						if(name.equals(prodName)) return true;
					}
				}
			}
		}
		return false;
	}
	
	private boolean findProduct(String prodName) {
		return orderItems
				.stream()
				.map(item -> item.getProduct())
				.anyMatch(prod -> prod.getProductName().equals(prodName));
				
	}
	
	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
