package lab3_inheritance_composition.problem4.code;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for(Property p: properties) {
			totalRent += p.computeRent();
		}
		return totalRent;
	}
}
