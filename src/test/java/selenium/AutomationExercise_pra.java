package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutomationExercise_pra {
  @Test
  public void signUpFunc() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://automationexercise.com/");
	  driver.manage().window().maximize();
  //home page
	  driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
	  //products page
    // driver.findElement(By.xpath("//i[@style='font-size: 16px;']")).sendKeys("women");
  
	  driver.findElement(By.xpath("//button[@id='submit_search']")).click();
	  driver.findElement(By.xpath("//a[@data-toggle='collapse']")).click();
/*	  try {
          // Navigate to the website
      //    driver.get("https://automationexercise.com/");

          // Perform actions that might cause exceptions
          WebElement adElement = driver.findElement(By.xpath("//*[@id=\"dismiss-button\"]/div/span"));

          FluentWait<WebDriver> wait = null;
		// Wait for the ad to be clickable, or for it to disappear
          wait.until(ExpectedConditions.elementToBeClickable(adElement));

       // Click on the ad or perform other actions related to the ad
          adElement.click();

          // Other automation steps...

      } catch (Exception e) {
          // Handle any other unexpected exception
          System.out.println("An unexpected error occurred: " + e.getMessage());
      } finally {
          // Perform cleanup or actions that should occur regardless of success or failure
          //driver.quit();
      }
      */
	  
	  driver.findElement(By.xpath("//a[text()='Saree ']")).click();
	
	Thread.sleep(1000);
	  WebElement a1 = driver.findElement(By.xpath("//*[@data-product-id='41']"));
	  a1.click();
	  driver.findElement(By.xpath("//*[@data-product-id='41']")).click();
	  driver.findElement(By.xpath("//div[@class='modal-body']")).click();
	  driver.findElement(By.xpath("//button[@class='btn btn-success close-modal btn-block']")).click();
	//Thread.sleep(500);
	//  //cart
	//  driver.findElement(By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[3]/a")).click();
	//  driver.findElement(By.xpath("//a[@class='btn btn-default check_out']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
	 
	   driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();

 /*     //login
	  driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello....");
	  driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("ADBJ@gmail.com");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hiiiii");
	  driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	  driver.findElement(By.xpath("//input[@value='Mrs']")).click();
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
	  //driver.findElement(By.xpath("//select[@data-qa='days']"));
	  Select select =new Select(driver.findElement(By.xpath("//select[@data-qa='days']")));
	  select.selectByIndex(11);
	  Select select1 =new Select(driver.findElement(By.xpath("//select[@data-qa='months']")));
	  select1.selectByIndex(9);
	  Select select2 =new Select(driver.findElement(By.xpath("//select[@data-qa='years']")));
	  select2.selectByIndex(6);
	  driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Priya");
	  driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("Lakshmi");
	  driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("OPQRST");
	  driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("hydgzgcvc ");
	  driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("hydgzgcvc ");
	  driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("yyyyy ");
	  driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("xxxxxxxx");
	  driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("235648 ");
	  driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("356894556 ");
	  driver.findElement(By.xpath("//button[@type='submit']")).click(); 
	 */
  }
}
