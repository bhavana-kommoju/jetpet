package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Writing_Xpath {
	//14 ways of x path 
  @Test
  public void f() throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
	 driver.manage().window().maximize();
	 //  /slash 
	 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/article/div/figure/table/tbody/tr[14]/td[1]/a")).click();
	 driver.findElement(By.xpath("//span[@class='flex-1']")).click();
	 driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("bha");

		
	  
  }
}
