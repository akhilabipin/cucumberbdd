package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MapRegisterStepDefinition {
	WebDriver driver;
	 @Given("^I have to launch application$")
	    public void i_have_to_launch_application(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe");
	 		driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("http://demowebshop.tricentis.com");
	    }

	    @Then("^I should click on Register Menu$")
	    public void i_should_click_on_register_menu() {
	    	WebElement rg=driver.findElement(By.xpath("//a[@class='ico-register']"));
	    	rg.click();
	    }

	    @Then("^I should select Gender$")
	    public void i_should_select_gender() {
	    	List<WebElement> radio= driver.findElements(By.xpath("//input[@type='radio']"));
	    	radio.get(1).click();
	    }
	    
	    @Then("^I should enter data$")
		public void i_should_enter_data(DataTable table) {
			for (Map<String, String> data   :   table.asMaps(String.class, String.class))
			{
				driver.findElement(By.id("FirstName")).sendKeys(data.get("FName"));
				driver.findElement(By.id("LastName")).sendKeys(data.get("LName"));
				driver.findElement(By.id("Email")).sendKeys(data.get("Email"));
				driver.findElement(By.id("Password")).sendKeys(data.get("Password"));
				driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get("CPassword"));
			}
			 @Then("^I should click on Register button$")
			    public void i_should_click_on_register_button() {
				 driver.findElement(By.id("register-button")).click();
			    }

			    @Then("^I should close browser$")
			    public void i_should_close_browser(){
			    	driver.close();
			    }
}
	    
	    
}
