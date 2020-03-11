package lab7_interfaces_Java8.prob2;

public class EquilateralTriangle implements ClosedCurve, Polygon {
	private double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	@Override
	public double[] getSides() {
		double[] sides = { side, side, side };
		return sides;
	}

	@Override
	public double computePerimeter() {
		return Polygon.super.computePerimeter();
	}

}
