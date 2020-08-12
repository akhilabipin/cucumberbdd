package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataDrivenStepDefinition {
          WebDriver driver;
@Given("^I have navigate to application$")
public void i_have_navigate_to_application(){
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours");
}
@Then("^I enter valid username \"([^\"]*)\"$")
public void i_enter_valid_username_something(String uname1){
	WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
	  user.sendKeys(uname1);
}

@And("^I should enter valid password \"([^\"]*)\"$")
public void i_should_enter_valid_password_something(String password) {
	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	  pass.sendKeys(password);
}
	
@Then("^I should click  submit button$") 
public void i_should_click_submit_button(){ WebElement
	 submit=driver.findElement(By.xpath("//input[@name='submit']"));
	 submit.click(); 
	 driver.close(); 
	 }
	 
}
