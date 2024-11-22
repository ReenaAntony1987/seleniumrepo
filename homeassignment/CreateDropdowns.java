package wk2.day1.homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDropdowns {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
				
				driver.get("http://leaftaps.com/opentaps/");
				
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Accounts")).click();
				
				driver.findElement(By.linkText("Create Account")).click();
				
				driver.findElement(By.id("accountName")).sendKeys("Jo JO");
				
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Testing");
				
				//industry
				
				WebElement dropDown = driver.findElement(By.name("industryEnumId"));
				
				Select opt =new Select(dropDown);
				opt.selectByIndex(2);
				
				WebElement dropDown1 = driver.findElement(By.name("ownershipEnumId"));
				
				Select opt1 =new Select(dropDown1);
				opt1.selectByVisibleText("S-Corporation");
				
				WebElement dropDown2 = driver.findElement(By.id("dataSourceId"));
				
				Select opt2 =new Select(dropDown2);
				opt2.selectByValue("LEAD_EMPLOYEE");
				
				WebElement dropDown3 = driver.findElement(By.id("marketingCampaignId"));
				
				Select opt3 =new Select(dropDown3);
				opt3.selectByValue("9000");
				
				driver.findElement(By.className("smallSubmit")).click();
	}
}
	
				
				//String accname = driver.findElement(By.xpath("//span[@class='tabletext'])[3]")).getText();
				
				
				//if (accname.contains("JO JO"));
				//{
				
				//System.out.println("Account Name is Matched");
				//}
				//{
					//System.out.println("Account name is not matched");
				//}
				//}
				
				
				
				
				
				
				

	


