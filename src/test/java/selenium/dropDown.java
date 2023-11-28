package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDown {
  @Test
  public void f() throws InterruptedException {
WebDriver driver = new ChromeDriver ();
	  
	  driver.get("https://www.leafground.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
	  
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-chevron-down layout-menuitem-icon']")).click();
	  driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	  Select select =new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
	  select.selectByIndex(1);
	  //driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")).sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right']")).click();
	 
	  
	 // driver.findElement(By.xpath("//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all']")).click();
	 // driver.findElement(By.xpath("//li[@data-label='Germany']")).click();
	  driver.findElement(By.xpath("//li[@data-label='India']")).click();
	  
	Thread.sleep(1000);
	 driver.findElement(By.xpath("//label[text()='Select City']")).click();
	 
		/*List<WebElement> ele= driver.findElements(By.xpath("//ul[contains(@id,':city_items')]"));
		List<String> Str = null;
		for(WebElement element:ele)
		{
			System.out.println(element.getText());
			Str.add(element.getText());
		}
		System.out.println(Str);*/
	 
	 driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
	 driver.findElement(By.xpath("//div[@class='ui-autocomplete ui-autocomplete-multiple']")).click();
	 
	 
  }
}
