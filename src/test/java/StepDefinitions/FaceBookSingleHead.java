package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FaceBookSingleHead {

	WebDriver driver;


	@Given("log in to facebook")
	public void log_in_to_facebook() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\Junit and TestNG\\CucumberTesting\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@When("type username and password")
	public void type_username_and_password(DataTable dataTable) {

		List<Map<String,String>> login=dataTable.asMaps(String.class,String.class);
		String uname=login.get(0).get("username");
		driver.findElement(By.id("email")).sendKeys(uname);


		String pword=login.get(0).get("password");
		driver.findElement(By.id("pass")).sendKeys(pword);

		// List<List<String>>log=dataTable.asLists(String.class);
		// System.out.println(log.get(0).get(0));

	}




}
