package lab2_associations.prob2A.Main;

import lab2_associations.prob2A.Student;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("John Doe");
		student.getGradeReport().setMathGrade("A");
		student.getGradeReport().setBiologyGrade("B");
		
		System.out.println(student.getGradeReport());
		
	}

}
