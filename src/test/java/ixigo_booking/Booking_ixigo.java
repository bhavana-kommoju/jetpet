package ixigo_booking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.cucumber.messages.types.Duration;

public class Booking_ixigo {
	@Test 
	public void booking() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[@class='u-ripple-circle']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='nav-list-item u-ib  selected u-nostyle-link']")).click();
		
//        driver.findElement(By.xpath("//input[@placeholder='Enter city or airport']")).sendKeys("IXX");
//		Entering from city/airport
        WebElement from=driver.findElement(By.xpath("//div[@class='flight-form max-container-width']/div/div/div/div/input"));
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
		Thread.sleep(2000);
		from.sendKeys("IXM");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_UP);
		from.sendKeys(Keys.ENTER);
		WebElement To=driver.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']/div/div/input"));
		To.sendKeys("MAA");
		Thread.sleep(2000);
		To.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//		date selection
		driver.findElement(By.xpath("//table[@class='rd-days']/tbody/tr[5]/td[4]")).click();
//		passengers selection
		driver.findElement(By.xpath("//div[@class='u-box-result']/div[2]/div[2]/span[7]")).click();
		driver.findElement(By.xpath("//div[@class='u-box-result']/div[3]/div[2]/span[2]")).click();
//		submit button
		driver.findElement(By.xpath("//div[@class='search u-ib u-v-align-bottom']/button")).click();
		Thread.sleep(6000);
//		sort 
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/div/span")).click();
//		selecting Quickest
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/ul/li[3]/span")).click();
//		clicking the arrows left and right
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div[2]")).click();
//		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div[3]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div[3]")).click();
		Thread.sleep(3000);
//		selecting the date 1st dec 
		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div/a[8]")).click();
		Thread.sleep(6000);
//		selecting non stop
		driver.findElement(By.xpath("//div[@class='stop-info'  and text()='Non stop']")).click();
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/div/span")).click();
//		selecting Quickest
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/ul/li[3]/span")).click();
		Thread.sleep(3000);
//      click on book
		driver.findElement(By.xpath("(//div[@class='book-cta'])[1]")).click();
//      enter email ID
		driver.findElement(By.xpath("//div[@class='u-ripple']")).click();
//      clicking in mobile no.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='c-input-cntr phone-email-input  is-phone']/span[2]/input")).sendKeys("701341343");
		driver.findElement(By.xpath("//*[text()='LOGIN']")).click();
//      enter email ID
		Thread.sleep(60000);
		driver.findElement(By.xpath("//div[@class='contact-group']/div/div[2]/div/div[2]/input")).sendKeys("traningteam04@gmail.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);
		int index = 1;
//		radio buttons(offer)
		List<WebElement> elements = driver.findElements((By.xpath("(//span[@class='radio-list']/div/span)")));
		for (WebElement element : elements) 
		{
			Thread.sleep(700);
			element.click();
			index += 2;
		}
//		continue button for passengers details
		driver.findElement(By.xpath("//div[@class='cnfrm-cntnr continue']/div/button")).click();
		Thread.sleep(2000);
//		risk it button
		WebElement riskButton=driver.findElement(By.xpath("//div[@class='cta-wrap']/div"));
		if(riskButton.isDisplayed())
		{
			riskButton.click();
		}
	
		
}
}
	

