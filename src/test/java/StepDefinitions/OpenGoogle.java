package StepDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OpenGoogle {
	
	

	private static final TakesScreenshot TakeScreenshot = null;
	WebDriver driver;
	
	@BeforeStep
	@Given("go to the webpage google")
	
	public void go_to_the_webpage_google() {
	System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\Junit and TestNG\\CucumberTesting\\src\\test\\resources\\Driver\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	    
	}

	@When("search the mobiles")
	public void search_the_mobiles() {
		driver.findElement(By.id("APjFq")).sendKeys("mobiles",Keys.ENTER);
	   
	}

	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			TakesScreenshot tc=(TakesScreenshot) driver;
			byte[] src=tc.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "errorscreen");
			
			
		}
	}
}

		
		