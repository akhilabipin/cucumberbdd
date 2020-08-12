package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^I would  navigate to Home Page$")
    public void i_would_navigate_to_home_page() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe\\");
	 		driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("http://demo.guru99.com/test/newtours/");
    }

	@And("^ I should enter Username and Password$")
    public void i_should_enter_username_and_password() {
		WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
		  username.sendKeys("tutorial");
		  WebElement password=driver.findElement(By.xpath("//input[@name='Password']"));
	  	  password.sendKeys("tutorial");
    }
	 @Then("^I should click on submit button$")
	    public void i_should_click_on_submit_button() {
		 WebElement submit=driver.findElement(By.xpath("//input[@submit='submit']"));
	   	  submit.click();
	  	JavascriptExecutor js=(JavascriptExecutor)driver;
	   	js.executeScript("window.scrollBy(0,500)");
	    }
}