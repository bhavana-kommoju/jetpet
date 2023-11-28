package com.step_definition;

import java.lang.reflect.Array;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_defination_class {
	WebDriver driver = new ChromeDriver();
	
	@Given("user have to enter in home page of OrangeHRM Web Application")
	public void user_have_to_enter_in_home_page_of_orange_hrm_web_application() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}

@When("user has to login into application and enter the user name")
public void user_has_to_login_into_application_and_enter_the_user_name() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input")).sendKeys("Admin");
}

@When("user should enter the password")
public void user_should_enter_the_password() {
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	
	
}

@When("user should click on the login button")
public void user_should_click_on_the_login_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
   }

	@When("user have to click on Recuriments option") 
	public void user_have_to_click_on_recuriments_option() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']/ul/li[5]/a")).click();
	}

	@Then("user should able to see Recuriments candidates page")
	public void user_should_able_to_see_recuriments_candidates_page() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[1]/div[1]")).click();
		//driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[1]/div[1]")).sendKeys(Keys.ARROW_DOWN);
	  //  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[1]/div[1]")).sendKeys(Keys.ENTER);
	}
		
	@When("user clicks on job title")
	public void user_clicks_on_job_title() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[1]/div[1]")).sendKeys(Keys.ARROW_DOWN);
	  //  driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[1]/div[1]")).sendKeys(Keys.ENTER);
		
	}

	@When("user selects Account Assitant")
	public void user_selects_account_assitant() {
		driver.findElement(By.xpath("//div[@class='oxd-select-wrapper']/div[1]/div[1]")).sendKeys(Keys.ENTER);
	}

	@When("user click on Vacancy")
	public void user_click_on_vacancy() {
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']/div[1]/div[1])[2]")).click();
	}

	@When("user selects Assiocate IT Manager")
	public void user_selects_assiocate_it_manager() {
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']/div[1]/div[1])[2]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']/div[1]/div[1])[2]")).sendKeys(Keys.ENTER);
	    
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")).click();
	    
	}

	@Then("user should Not found any record in approration number")
	public void user_should_not_found_any_record_in_approration_number() {
	//	driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]")).click();
		WebElement alertButton = driver.findElement(By.xpath("//div[@class='oxd-form-actions']/button[2]"));
		alertButton.click();
	/*	// Switch to the alert
        Alert alert = driver.switchTo().alert();
        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
        alert.dismiss();
*/
	}





}
