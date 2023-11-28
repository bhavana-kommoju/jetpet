package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class jpet_store {
	@Test()
	public void A (){
		WebDriver driver = new ChromeDriver ();
		  
		  driver.get("https://petstore.octoperf.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[text( )='Enter the Store']")).click();
		  driver.findElement(By.xpath("//a[text( )='Sign In']")).click();
		  driver.findElement(By.xpath("//a[text( )='Register Now!']")).click();
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhavana");
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sai");
		  driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("Sai");
		 // driver.findElement(By.xpath("  ")).click();
		  driver.findElement(By.xpath("//*[@name='account.lastName']//preceding::input[@name='account.firstName']")).sendKeys("Bhavana");
		  driver.findElement(By.xpath("//*[@name='account.firstName']/following::input[@name='account.lastName']")).sendKeys("sai");
		  driver.findElement(By.xpath("//input[@name='account.email']")).sendKeys("kbhavanasai@gmail.com");
		  driver.findElement(By.xpath("//input[@name='account.phone']")).sendKeys("2354687564");
		  //("(//input[@type='text'])[position()=2]"))
		  driver.findElement(By.xpath("//input[@name='account.address1'][position()=1]")).sendKeys("kukatpally");
		  driver.findElement(By.xpath("//input[@name='account.address2'][position()=1]")).sendKeys("kukatpally");
		  
		  driver.findElement(By.xpath("//input[@name='account.city']")).sendKeys("hyderabad");
		  driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("telangana");
		  //"(//input[@type='text'])[last()]"))
		  driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("500039");
		 
		  driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
		  Select select =new Select(driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
		  select.selectByIndex(0);
	      Select sel =new Select(driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
	      sel.selectByIndex(1);
	      driver.findElement(By.xpath("//input[starts-with(@name,'new')]"));
	      driver.findElement(By.xpath("browser.quit"));
	}
}
