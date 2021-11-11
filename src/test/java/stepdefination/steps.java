package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;
	@Given("User is on Home Page of youtube")
	public void user_is_on_home_page_of_youtube() {
		driver.get("https://www.youtube.com/");
        
	    
	}

	@When("user types and clicks Enter")
	public void user_types_and_clicks_enter() {
WebElement e=driver.findElement(By.id("search"));
e.sendKeys("polo");

        
	}
	@Then("title should be youtube")
	public void title_should_be_youtube() {
	    System.out.println(driver.getTitle());
	}

@Before//it is example of hooks pre conditon
public void before() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Rahunandan.Raghunandan\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
	driver=new ChromeDriver();	
}
@After//it is example of post condition 
public void after() {
	driver.quit();}}