package lab5_abstraction.problem3;

public final class Circle implements ClosedCurve{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius *  radius;
	}
}
