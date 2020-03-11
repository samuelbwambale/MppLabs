package lab3_inheritance_composition.problem3.code;

public class Circle {
	private double radius;
	private String color;
	private double area;

	Circle() {
		radius = 1.0;
		color = "red";
		area = Math.PI;
	}

	Circle(double radius) {
		this.radius = radius;
		color = "red";
		area = Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return area;
	}

	public String toString() {
		return "Circle:Radius=" + radius + " Area=" + area + " color=" + color;

	}

}
