package assignment.week3.day1;

public class Automation extends MultipleLanguage implements Language, TestTool{

	public void selenium() {
		System.out.println("Selenium: Most sorted Tool for UI automation");
	}

	public void java() {
		System.out.println("Java: Most famous programming language ");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby: Programming Language");
	}
	
	public static void main(String[] args) {
		Automation lang = new Automation();
		lang.java();
		lang.python();
		lang.ruby();
		lang.selenium();
	}

}
