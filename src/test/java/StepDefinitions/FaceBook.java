package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FaceBook {
	
	
	WebDriver driver;
	@Given("enter the url")
	public void enter_the_url() {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\kapali\\Documents\\AIITE programs\\New Javaproject\\Junit and TestNG\\CucumberTesting\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("type username")
	public void type_username(DataTable dataTable) {
		
		List<String>fbSingle=dataTable.asList(String.class);
		
		//System.out.println(fbSingle.get(0));
	//	System.out.println(fbSingle.get(1));
		System.out.println(fbSingle.get(2));
	//	System.out.println(fbSingle.get(3));
	
		
		//String fname=fbSingle.get(0);
		//driver.findElement(By.id("email")).sendKeys(fname);
		
	
		
	//	String fname1=fbSingle.get(1);
	//	driver.findElement(By.id("email")).sendKeys(fname1);
		
	
		
		//String fname2=fbSingle.get(2);
	//	driver.findElement(By.id("email")).sendKeys(fname2);
		
	
		
	//	String fname3=fbSingle.get(3);
	//	driver.findElement(By.id("email")).sendKeys(fname3);
		
		//driver.findElement(By.name("login")).click();
		
	List<List<String>>login=dataTable.asLists();
	System.out.println(login.get(0).get(0));
		
		
	
	    
	}


}
