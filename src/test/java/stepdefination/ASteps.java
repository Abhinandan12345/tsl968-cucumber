package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ASteps {
	WebDriver driver;
	@Given("User is on Home Page of Selenium")
	public void user_is_on_home_page_of_selenium() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahunandan.Raghunandan\\Downloads\\chromedriver_win32//chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://www.selenium.dev/");
	}

    @When("user clicks on Download link")
	public void user_clicks_on_download_link() {
	driver.findElement(By.cssSelector("a[class='nav-link']")).click();
	}
	@Then("title should be {string}")
	public void title_should_be(String string) {
	   String s=driver.getTitle();
	   System.out.println(s);
	}
}
