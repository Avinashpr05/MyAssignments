package assignment.week3.day1.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("15 inches");	
	}
	
	public static void main(String[] args) {
		Desktop hp = new Desktop();
		hp.computerModel();
		hp.desktopSize();
	}
	
}
