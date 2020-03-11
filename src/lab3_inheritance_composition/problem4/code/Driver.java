package lab3_inheritance_composition.problem4.code;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
