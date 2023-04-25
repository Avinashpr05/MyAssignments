package assignment.week1.day1;

public class Browser {
	
	public static void main(String[] args) { 				
		System.out.println("This is my Browser");

		System.out.println("\n");
		System.out.println("----Accessing the properties of an another class 'chrome'----");
		Chrome obj = new Chrome();
		obj.getName();
		obj.printName();
	}
}
