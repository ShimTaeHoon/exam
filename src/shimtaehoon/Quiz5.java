package shimtaehoon;

public class Quiz5 {

	public static void main(String[] args) {

		Student student = new Student(1001, "둘리");
		Student student2 = new Student(1002, "또치");
		Student student3 = new Student(1003, "도우너");
		
		student.showInfo();
		student2.showInfo();
		student3.showInfo();

	}

}

class Student {
	int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public void showInfo() {
		System.out.println("Student [studentID=" + studentID + 
							", studentName=" + studentName + "]");
	}

}