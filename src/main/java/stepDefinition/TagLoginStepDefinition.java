package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TagLoginStepDefinition {
	WebDriver driver;
	@Given("^Launch the browser$")
	public void launch_the_browser() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bipin\\Desktop\\chrome\\chromedriver.exe");
			
		    driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	}
	@Given("^I navigate to Home Page$")
	public void i_navigate_to_Home_Page() {
		
	 		driver.get("http://demowebshop.tricentis.com");
	 		
	}

	@Then("^I click on Login button$")
	public void i_click_on_Login_button() {
		WebElement lg=driver.findElement(By.xpath("//a[@class='ico-login']"));
    	lg.click();
	}

	@Then("^I should enter valid email id and password$")
	public void i_should_enter_valid_email_id_and_password() {
		WebElement user=driver.findElement(By.xpath("//input[@id='Email']"));
	  	  user.sendKeys("akhilaraj2020@gmail.com");
	  	  WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	  	  password.sendKeys("akhila123");
	  	     	
	}

	@Then("^Click on login button$")
	public void click_on_login_button1() {
		 WebElement login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	   	  login.click();
	   	driver.close();
	}

	@Given("^Launch the Home Page$")
	public void launch_the_Home_Page() {
		driver.get("http://demowebshop.tricentis.com");
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() {
		WebElement lg=driver.findElement(By.xpath("//a[@class='ico-login']"));
    	lg.click();
	}

	@Then("^user should enter invalid email id and valid password$")
	public void user_should_enter_invalid_email_id_and_valid_password() {
		WebElement user=driver.findElement(By.xpath("//input[@id='Email']"));
	  	  user.sendKeys("akhila@gmail.com");
	  	  WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	  	  password.sendKeys("akhila123");
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() {
		 WebElement login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	   	  login.click();
	   	  driver.close();
	}

	@Given("^user should Launch the Home Page$")
	public void user_should_Launch_the_Home_Page() {
		driver.get("http://demowebshop.tricentis.com");
	}

	@Then("^user should click on Login button$")
	public void user_should_click_on_Login_button() {
		WebElement lg=driver.findElement(By.xpath("//a[@class='ico-login']"));
    	lg.click();
	}

	@Then("^user should enter valid email id and invalid password$")
	public void user_should_enter_valid_email_id_and_invalid_password() {
		WebElement user=driver.findElement(By.xpath("//input[@id='Email']"));
	  	  user.sendKeys("akhilaraj2020@gmail.com");
	  	  WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	  	  password.sendKeys("123");
	}

	@Then("^user should click on login button$")
	public void user_should_click_on_login_button() {
		 WebElement login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	   	  login.click();
	   	driver.close();
	}

	@Given("^user should navigate to Home Page$")
	public void user_should_navigate_to_login_Page() {
		driver.get("http://demowebshop.tricentis.com");
	}
	@Then("^user should click on Login$")
	public void user_should_click_on_Login() {
		WebElement lg=driver.findElement(By.xpath("//a[@class='ico-login']"));
    	lg.click();
	}
	@Then("^user should enter blank email id and blank password$")
	public void user_should_enter_blank_email_id_and_blank_password() {
		WebElement user=driver.findElement(By.xpath("//input[@id='Email']"));
	  	  user.sendKeys(" ");
	  	  WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
	  	  password.sendKeys(" ");
	}

	@Then("^click on login$")
	public void click_on_login_() {
		 WebElement login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
	   	  login.click();
	   	driver.quit();
	}



}
