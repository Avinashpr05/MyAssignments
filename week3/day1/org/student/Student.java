package assignment.week3.day1.org.student;

import assignment.week3.day1.org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Akash");		
	}
	
	public void studentDept() {
		System.out.println("Student Department : Mechanical Engineering");		
	}
	
	public void studentId() {
		System.out.println("Student ID: 123456");		
	}
	
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.collegeName();
		st1.collegeCode();
		st1.collegeRank();
		st1.deptName();
		st1.studentName();
		st1.studentDept();
		st1.studentId();
	}

}
