package assignment.week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID: "+ id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Student ID: "+ id);
		System.out.println("Student Name: "+ name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email: "+ email);
		System.out.println("Student PhNo: "+ phoneNumber);
	}
	
	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(25);
		obj.getStudentInfo(25,"Akash");
		obj.getStudentInfo("akash@gmail.com", 1234567899l);
	}


}
