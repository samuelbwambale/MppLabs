package lab5_abstraction.problem3;

public final class Triangle implements ClosedCurve {
	private double base;
	private double height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return 0.5* base * height;
	}
}
