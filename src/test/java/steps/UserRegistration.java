package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UserRegistration {
	
	WebDriver driver;
	@Given("I am on Registration.jsp Page")
	public void i_am_on_registration_jsp_page() {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://localhost:8080/GrievanceRedressalPortal/member.jsp");
	}

	@When("I insert {string} {string} {string} and {string}")
	public void i_insert_and(String string, String string2, String string3, String string4) {
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(string2);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string3);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(string4);
	    driver.findElement(By.xpath("//button[@id='submit-b']")).click();
	}

	@Then("I naviagate to google.com")
	public void i_naviagate_to_google_com() {
		 String expURL = "https://www.google.com/";
		  String actURL = driver.getCurrentUrl();
		  
		  if(!expURL.equals(actURL))
			  fail("Page does not navigate to expected page!");
		  
		  driver.quit();
	}

}
