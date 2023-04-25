package assignment.week1.day1;

public class Bike {
	
	public void detailsBike() {
		System.out.println("Top speed: 140 km/h");
	}

	public static void main(String[] args) {
	Car obj = new Car();
	obj.applyBreak();
	obj.soundHorn();
	
	Bike obj1 = new Bike();
	obj1.detailsBike();	
	}
}
