import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
    WebDriver dr;
	@Given("^open broswer$")
	public void open_broswer() throws Throwable {
	   dr= new ChromeDriver();
	}

	
	@Given("^nevigate to url$")
	public void nevigate_to_url() throws Throwable {
	   dr.get("https://www.facebook.com/");
	}

	
	@When("^user type userid in usertext box$")
	public void user_type_userid_in_usertext_box() throws Throwable {
		dr.findElement(By.xpath("")).sendKeys("ruman");
	 
	}

	
	@When("^user type password in password box$")
	public void user_type_password_in_password_box() throws Throwable {
	   dr.findElement(By.xpath("")).sendKeys("car");
	}

	
	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	   dr.findElement(By.xpath("")).click();
	}

	
	@Then("^user should be in his profile page$")
	public void user_should_be_in_his_profile_page() throws Throwable {
	    if(dr.findElement(By.id("signout")).isDisplayed()) {
	    	
	    }
	}	
	
}
