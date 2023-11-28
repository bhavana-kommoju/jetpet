package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testLeaf {
  @Test
  public void f() {
 WebDriver driver = new ChromeDriver ();
	  
	  driver.get("https://www.leafground.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-check-square layout-menuitem-icon']")).click();
	  driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("Bhavana");
	  driver.findElement(By.xpath("//input [@id='j_idt88:j_idt91']")).sendKeys("India");
	 
	  WebElement element= driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']"));
	  System.out.println( element.isEnabled());
	  
	  
	  driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
	  driver.findElement(By.xpath("//input [@id='j_idt88:j_idt97']")).clear();
	  driver.findElement(By.xpath("//input [@id='j_idt88:j_idt99']")).sendKeys("kbhavana@gmail.com");
	  driver.findElement(By.xpath("//input [@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("Leaf ground");
	  //Text Editor
	  driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//span[@class='ql-picker-label']")).sendKeys(Keys.TAB);
	  /*driver.findElement(By.xpath("//button[@class='ql-bold'']")).click();
	   driver.findElement(By.xpath("//div[@class='ui-editor-toolbar ql-toolbar ql-snow']")).sendKeys(Keys.TAB);*/
	  
	  driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(".......");
	 driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).sendKeys("......");
	 driver.findElement(By.xpath("//ul[@class='ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left']")).click();
	// driver.findElement(By.xpath("//span[@class=ui-button-text']")).click();
  }
  
  
  
  
}
