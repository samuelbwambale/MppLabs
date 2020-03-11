package lab5_abstraction.problem3;

public final class Rectangle implements ClosedCurve {
	private double height, width;
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
}
