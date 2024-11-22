package wk2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fblogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com");

		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Joseph");
		
	
				driver.findElement(By.name("lastname")).sendKeys("Vinoth");
				 
				driver.findElement(By.name("reg_email__")).sendKeys("vinothjoseph_1984@gmail.com");
				
				driver.findElement(By.name("reg_passwd__")).sendKeys("Vinothjoseph@1984");
			 
				WebElement drop1 = driver.findElement(By.id("day"));
				Select opt1 = new Select(drop1);
				opt1.selectByVisibleText("15");
				
				WebElement drop2 = driver.findElement(By.id("month"));
				Select opt2 = new Select(drop2);
				opt2.selectByVisibleText("Jan");
				
				WebElement drop3 = driver.findElement(By.id("year"));
				Select opt3 = new Select(drop3);
				opt3.selectByVisibleText("2005");
				
				driver.findElement(By.id("sex")).click();
		
		
	}
	

}
