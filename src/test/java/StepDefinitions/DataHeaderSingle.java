package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataHeaderSingle {

	WebDriver driver;


	@Given("go to the webpage letcode")
	public void go_to_the_webpage_letcode() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\Junit and TestNG\\CucumberTesting\\src\\test\\resources\\Driver\\chromedriver.exe");

		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/forms");


	}

	@When("enter login details")
	public void enter_login_details(DataTable table) {
		List<Map<String,String>>user=table.asMaps(String.class,String.class);
		String fname=user.get(0).get("firstname");
		System.out.println("firstname:"+fname);
		driver.findElement(By.id("firstname")).sendKeys(fname);



		String lname=user.get(0).get("lastname");
		System.out.println("lastname:"+lname);
		driver.findElement(By.id("lasttname")).sendKeys(lname);


		String state=user.get(0).get("state");
		System.out.println("state:"+state);
		driver.findElement(By.id("state")).sendKeys(state);





	}

	



}
