package selenium;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver ();
	  
	  driver.get("https://www.ajio.com/");
	  System.out.println("open the ajio app");
	//  String title =driver.getTitle();
	 // System.out.println("go to ajio app' "+title);
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//span [@class='  login-form login-modal']")).click();
	 // driver.navigate().back();
	 // @SuppressWarnings({ "rawtypes", "unchecked" })
	List<String>namesList=new ArrayList();
	  List<WebElement> elementList=driver.findElements(By.xpath("//ul[@class='level-first false']"));
	 for (WebElement elementname : elementList) {
		 
		 String name=elementname.getText();
		 namesList.add(name);
		 
	}
	  System.out.println("the List f string"+namesList);
  }
}
