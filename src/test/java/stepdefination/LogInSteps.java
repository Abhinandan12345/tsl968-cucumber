package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInSteps {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		
		driver.get("http://demo.frontaccounting.eu/");
	   
	}


	

	@When("user enters username as {string} & password as  {string} & clicks on login")
	public void user_enters_username_as_password_as_clicks_on_login(String user, String pwd) {
	driver.findElement(By.name("user_name_entry_field")).clear();
	driver.findElement(By.name("user_name_entry_field")).sendKeys(user);
	driver.findElement(By.name("password")).clear();;
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.name("SubmitUser")).click();
	}
	@Then("login {string} be happen")
	public void login_be_happen(String status) {
	if(status.equals("should")) {
		if(driver.getTitle().equals("Main Menu")){
			System.out.println("positive test case passed");
		}
		else{
			System.out.println("positive test case failed");
			Assert.fail("positive test case failed");
		}
	}
	else {
		if(status.equals("shouldNot")) {
			if(driver.equals("MainMenu")) {
				
				System.out.println("negative test case is failed");
				Assert.fail("negative test case is failed");
			}
			else {
				System.out.println("negative test case is passed");
			}}
		}
		
	}
	@Before//it is example of hooks pre conditon
	public void before() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Rahunandan.Raghunandan\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();	
	}
	@After//it is example of post condition 
	public void after() {
		driver.quit();
		
	}
	}

