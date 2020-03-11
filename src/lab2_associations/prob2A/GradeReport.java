package lab2_associations.prob2A;

public class GradeReport {
	private Student student;
	private String mathGrade;
	private String biologyGrade;
	
	GradeReport(Student stud) {
		this.student = stud;
		
	}
	
	@Override
	public String toString() {
		return "GradeReport [student=" + student.getName() + ", mathGrade=" + mathGrade + ", biologyGrade=" + biologyGrade + "]";
	}

	public String getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(String mathGrade) {
		this.mathGrade = mathGrade;
	}
	public String getBiologyGrade() {
		return biologyGrade;
	}
	public void setBiologyGrade(String biologyGrade) {
		this.biologyGrade = biologyGrade;
	}
	
}
