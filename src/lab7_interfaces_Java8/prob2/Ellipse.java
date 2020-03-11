package lab7_interfaces_Java8.prob2;

public class Ellipse implements ClosedCurve {
	private double eccentricity;
	private double semiMajorrAxis;

	public Ellipse(double a, double b) {
		setSemiMajorrAxis(a);
		setEccentricity(b);
	}

	@Override
	public double computePerimeter() {
		double perimeter = 4 * eccentricity * semiMajorrAxis;
		return perimeter;
	}

	public double getEccentricity() {
		return eccentricity;
	}

	public void setEccentricity(double eccentricity) {
		this.eccentricity = eccentricity;
	}

	public double getSemiMajorrAxis() {
		return semiMajorrAxis;
	}

	public void setSemiMajorrAxis(double semiMajorrAxis) {
		this.semiMajorrAxis = semiMajorrAxis;
	}

}
