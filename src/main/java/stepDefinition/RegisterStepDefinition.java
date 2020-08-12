package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterStepDefinition {
	
	WebDriver driver;
	@Given("^I should have navigate to application$")
    public void i_should_have_navigate_to_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours");
        
    }

    @Then("^I should click on Register menu$")
    public void i_should_click_on_register_menu(){
    	WebElement register=driver.findElement(By.linkText("REGISTER"));
		  register.click();
    }

    @Then("^I should enter the Contact Information$")
    public void i_should_enter_the_contact_information(DataTable table){
    	List<List<String>> data=table.raw();
		 WebElement firstname=driver.findElement(By.name("firstName"));
		  firstname.sendKeys(data.get(0).get(0));
		  WebElement lastname=driver.findElement(By.name("lastName"));
		  lastname.sendKeys(data.get(0).get(1));
		  WebElement phone=driver.findElement(By.name("phone"));
		  phone.sendKeys(data.get(0).get(2));
		  WebElement email=driver.findElement(By.name("userName"));
		  email.sendKeys(data.get(0).get(3));
    }
    
    @Then("^I should enter the Mailing Information$")
	public void i_should_enter_the_Mailing_Information(DataTable table2) {
		List<List<String>> data=table2.raw();
		 WebElement address1=driver.findElement(By.name("address1"));
		  address1.sendKeys(data.get(0).get(0));
		  WebElement city=driver.findElement(By.name("city"));
		  city.sendKeys(data.get(0).get(1));
		  WebElement state=driver.findElement(By.name("state"));
		  state.sendKeys(data.get(0).get(2));
		  WebElement postalCode=driver.findElement(By.name("postalCode"));
		  postalCode.sendKeys(data.get(0).get(3));
		  WebElement country=driver.findElement(By.name("country"));
		  Select c= new Select(country);
		  c.selectByVisibleText(data.get(0).get(4));
		  

	}
    @Then("^I should enter the User Information$")
	public void i_should_enter_the_User_Information(DataTable table3) {
		List<List<String>> data=table3.raw();
		WebElement username=driver.findElement(By.id("email"));
		  username.sendKeys(data.get(0).get(0));
		  WebElement password=driver.findElement(By.name("password"));
		  password.sendKeys(data.get(0).get(0));
		  WebElement confirmpassword=driver.findElement(By.name("confirmPassword"));
		  confirmpassword.sendKeys(data.get(0).get(0));
		 
		
	}

	@Then("^I should click on submit menu$")
	public void i_should_click_on_submit_menu() {
		 WebElement submit=driver.findElement(By.name("submit"));
		  submit.click();
		  driver.close();
	}

}



