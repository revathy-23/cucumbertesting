package StepDefinitions;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

//source refrence:https://qaautomation.expert/2021/04/24/datatables-in-cucumber/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SingleData {
	

	WebDriver driver;
	
	@Given("go to the webpage letcodeform")
	public void go_to_the_webpage_letcodeform() {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\Junit and TestNG\\CucumberTesting\\src\\test\\resources\\Driver\\msedgedriver.exe");

		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/forms");
	    	}

	@When("enter name and state details")
	public void enter_name_and_state_details(io.cucumber.datatable.DataTable dataTable) {
		
	   List<String>login=dataTable.asList(String.class);
	   
	String fname=login.get(0);
	driver.findElement(By.id("firstname")).sendKeys(fname);
	
	String lname=login.get(0);
	driver.findElement(By.id("lasttname")).sendKeys(lname);

		
	driver.findElement(By.xpath("//input[@type='submit']")).submit();

	
	
	}
}


	


	
	



