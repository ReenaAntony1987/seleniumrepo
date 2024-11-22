package wk2.day1.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInteractionWithWebElements {

	public static void main(String[] args) throws InterruptedException {
	
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("30");
		
		driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(10000);
		
		//driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		
		//if(title.contains("Selenium Automation Tester")) {
			//System.out.println("Title is printed");
		//}else {
			//System.out.println("Title is not printed");
		}
		
		
		
		
		//driver.findElement(By.linkText("Logout")).click();
				
		
		
		
		
	
		
		
		
		
		
		
		
		
	
				

	}


