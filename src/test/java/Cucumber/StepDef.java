package Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Cucumber.Aug26OB.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	WebDriver driver;
	WebDriverWait wait;

	@Given("^User is in the login page to login$")
	public void user_is_in_the_login_page_to_login() throws Throwable {
		driver = UtilityClass.startBrowser("firefox", "http://www.demoaut.com/");
	}

	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\" to login$")
	public void user_enter_and_to_login(String arg1, String arg2) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.name("login")).click();
	}

	@Then("^Home page must be displayed$")
	public void home_page_must_be_displayed() throws Throwable {
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("tripType")));
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		driver.close();
		System.out.println("logged in Successfully !!");
	}

}
