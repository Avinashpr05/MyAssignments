package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		// Open the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL:http://leaftaps.com/opentaps/control/login
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximise the window
		driver.manage().window().maximize();		
		
		// Enter UserName
		driver.findElement(By.id("username")).sendKeys("demosalesManager");

		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click CRM/SFA
		driver.findElement(By.partialLinkText("CRM")).click();

		// Click Contacts Tab
		driver.findElement(By.linkText("Contacts")).click();
		
		// Click Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		
		// Type First Name
		driver.findElement(By.id("firstNameField")).sendKeys("Avinash");
		
		// Type Last Name
		driver.findElement(By.id("lastNameField")).sendKeys("P.R.");

		// Click Create Contact Button
		driver.findElement(By.name("submitButton")).click();
		
		// Print the first name and browser title 
		System.out.println(driver.findElement(By.id("viewContact_firstName_sp")).getText());
//		String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
//		System.out.println(text);
		
		System.out.println(driver.getTitle());
//		String title = driver.getTitle();
//		System.out.println(title);
		
		// Close the browser
		driver.close();
	}
}
