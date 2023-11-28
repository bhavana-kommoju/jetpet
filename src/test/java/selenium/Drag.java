package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.performance.Performance;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.beust.jcommander.JCommander.Builder;

public class Drag {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-calendar layout-menuitem-icon']")).click();
	  
	  //dragAndDrop
	  WebElement ele =driver.findElement(By.xpath("//div[@id='form:conpnl_header']"));
	  Actions act = new Actions(driver);
	 act.dragAndDropBy(ele, 70, 20).build().perform();
  
	 //Droppable Target
	 WebElement ele1 =driver.findElement(By.xpath("//div[@id='form:drop']"));
	 WebElement ele2 = driver.findElement(By.xpath("//div[@id='form:drag']"));
	 act.dragAndDrop(ele2,ele1).build().perform();
	 //Draggable Columns
	 WebElement ele3 = driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th"));	 
	 WebElement ele4 = driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[3]"));	
	 Thread.sleep(1000);
	 act.clickAndHold(ele3).build().perform();   //	  Actions act = new Actions(driver);
     act.moveToElement(ele4).build().perform();
     Thread.sleep(2000);
     act.release(ele4).build().perform();
     
     //Draggable Rows
     WebElement ele5 = driver.findElement(By.xpath("// tbody[@id='form:j_idt111_data']/tr[1] "));
     WebElement ele6 = driver.findElement(By.xpath("// tbody[@id='form:j_idt111_data']/tr[3] "));
     Thread.sleep(1000);
     act.dragAndDrop(ele6, ele5).build().perform();
     
  }
}