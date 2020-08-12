package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SimpleDataDrivenStepDefinition {
	WebDriver driver;
	@Given("^I should launch application$")
    public void i_should_launch_application() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe");
	 		driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("http://demo.guru99.com/test/newtours");
}
	  @Then("^I should enter username \"([^\"]*)\"$")
	    public void i_should_enter_username_something(String username)  {
		WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
	  	  user.sendKeys(username);
    }
	
   
		@And("^I  have enter password \"([^\"]*)\" $")
	    public void i_should_enter_password_something(String passwd) {
		  WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	  	  pass.sendKeys(passwd);
	    }
		@Then("^I should select to the submit button$")
	    public void i_should_select_to__the_submit_button() {
		  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	    	submit.click();
	    	driver.close();
	    }
}