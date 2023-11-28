package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
  @Test
  public void f() {
WebDriver driver = new ChromeDriver ();
	  
	  driver.get("https://www.leafground.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-mobile layout-menuitem-icon']")).click();
	  driver.findElement(By.xpath("//button[@type='button']")).click();
	  driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-mobile layout-menuitem-icon']")).click();
	  
	  WebElement element= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
	  System.out.println( element.isEnabled());
	  driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")). sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).click();
  }
}
