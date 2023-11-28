package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swag_Labs {
  @Test
  public void f() {
WebDriver driver = new ChromeDriver ();
	  
	  driver.get("https://parabank.parasoft.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Bhavanasai");
	 // driver.findElement(By.xpath("//*[@name='customer.lastName']//preceding::input[@id='customer.firstName']")).sendKeys(" bhavana");
	  driver.findElement(By.xpath("//*[@id='customer.firstName']/following::input[@name='customer.lastName']")).sendKeys("sai");
	//*[@id='LastName']//preceding::input[@type='text']"
	  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("kukatpally");
	  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("hyderabad");
	  driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("telangana");
	  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("500039");
		 
  }
}
