package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class auto_pra_2 {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://automationexercise.com/");
	  driver.manage().window().maximize();

	  driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("xyz12@gmail.com");
	  driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");
	  
  }
}
