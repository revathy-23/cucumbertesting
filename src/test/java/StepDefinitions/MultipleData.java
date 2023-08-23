package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class MultipleData {

	WebDriver driver;
	
	@Given("log in to the letcode form")
	public void log_in_to_the_letcode_form() {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\Junit and TestNG\\CucumberTesting\\src\\test\\resources\\Driver\\chromedriver.exe");

		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/forms");
	}
		
	
	

	@When("enter login credentials in the form")
	public void enter_login_credentials_in_the_form(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>>form=dataTable.asMaps(String.class,String.class);
		for(Map<String,String> data:form) {
			String fname=data.get("firstname");
			System.out.println("firstname:"+fname);
			driver.findElement(By.id("firstname")).sendKeys(fname);
			
			String lname=data.get("lastname");
			System.out.println("lastname:"+lname);
			driver.findElement(By.id("lasttname")).sendKeys(lname);
			
			String state=data.get("state");
			System.out.println("state:"+state);
			driver.findElement(By.id("state")).sendKeys(state);
			
			driver.findElement(By.xpath("//input[@type='submit']")).submit();


			
		}
		
		
	}
	   

	
	
	
}
