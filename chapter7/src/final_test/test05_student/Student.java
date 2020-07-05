package final_test.test05_student;

public class Student{
	private String name;
	private String subject;
	private int sNum;
	private double grade;
	
	public Student(String name, String subject, int sNum, double grade) {
		this.name = name;
		this.subject = subject;
		this.sNum = sNum;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public double getGrade() {
		return grade;
	}
	public String getSubject() {
		return subject;
	}
	public int getsNum() {
		return sNum;
	}
	@Override
	public String toString() {
		return name + ", " + subject + ", " + sNum + ", " + grade;
	}
}
