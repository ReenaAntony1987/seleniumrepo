package wk2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//creating leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("jo");
		
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("francelin");
		
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("jo");
		//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("jo");
		
		
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		
		Thread.sleep(10000);
		driver.findElement(By.name("submitButton")).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
	

}
