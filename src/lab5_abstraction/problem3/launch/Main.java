package lab5_abstraction.problem3.launch;

import java.util.Arrays;
import java.util.List;

import lab5_abstraction.problem3.*;

public class Main {

	public static void main(String[] args) {
		
		List<ClosedCurve> listOfClosedCurve = Arrays.asList(new Triangle(11.7,3.6),	
																new Rectangle(7.9, 8.0), 
																new Circle(4.9));
		
		for(ClosedCurve cc:listOfClosedCurve) {
			System.out.println("Area of a "+ cc.getClass().getSimpleName()+" = "+ cc.computeArea());
		}
	}
}
