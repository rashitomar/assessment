

package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

@RunWith(Cucumber.class)
public class compose_step_def {
	
	public WebDriver driver;

	 @Given("^user is on Gmail page$")
	    public void user_is_on_gmail_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars1\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
	    }

	    @When("^ user enters email and password$")
	    public void user_enters_email_and_password() throws Throwable {
      
	    	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
			
			WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
			email.sendKeys("danesumedha21@gmail.com");
			
			password.sendKeys("Sumedha@1234");
	    }
	    
	    @And("^  click on Next Button$")
	    public void click_on_next_button() throws Throwable {
	    	WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
			next.click();
	    }


	    @When("^ user click on Compose Button$")
	    public void user_click_on_compose_button() throws Throwable {
	        
	    	WebElement compose=driver.findElement(By.xpath("//div[text()='Compose']"));
			compose.click();
	    	
	    }

	    @When("^ user click on Subject section $")
	    public void user_click_on_subject_section() throws Throwable {
	    	
	    	WebElement subject=driver.findElement(By.xpath("//input[@placeholder='Subject']"));
			subject.sendKeys("Incubyte");
	    }

	    @When("^ user click on Body of mail  $")
	    public void user_click_on_body_of_mail() throws Throwable {
	    	WebElement body=driver.findElement(By.xpath("//div[@role='textbox']"));
			body.sendKeys("Automation QA test for Incubyte");
	    }

	    @When("^user click on Send button$")
	    public void user_click_on_send_button() throws Throwable {
	    	WebElement send=driver.findElement(By.xpath("//div[@data-tooltip='Send ‪(Ctrl-Enter)‬']"));
			send.click();
	        
	    }

	    @Then("^user is on Gmail home page$")
	    public void user_is_on_gmail_home_page() throws Throwable {
	    	System.out.println("user is on Gmail home page");
	    	
	    }

	    @Then("^Message displayed Message Sent Successfully$")
	    public void message_displayed_message_sent_successfully() throws Throwable {
	    	System.out.println("Message Sent successully");
	    	
	        
	    }

	    
	    @And("^  user click on TO section of compose mail$")
	    public void user_click_on_to_section_of_compose_mail() throws Throwable {
	    	WebElement to=driver.findElement(By.xpath("//input[@id=':u1']"));
	    	to.sendKeys("pqr@gmail.com");
	    	
	        	  
	    }

	    

	}