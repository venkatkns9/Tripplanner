package planDefinitions;
import common.Utilities;
import java.util.List;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tripPlanDefinition extends Utilities {
	public static WebDriver driver;
	WebDriverWait wait;
	WebElement fromLocation,toLocation;	
	public String expr = "//*[@id='search-results-success']";
	Properties tstData;
	Utilities utils=new Utilities();
	
	//This is a test set-up method which runs before each scenario	
	@Before
	public void setUp(){
		 driver=utils.initializeDriver();
		 tstData=utils.loadPropertiesfile();
	}
	
	//Test steps to validate the "Phileas is planning a trip"
	@Given("^Phileas is planning a trip$")
	public void gotoNSWPlanner() { 		
		driver.navigate().to(tstData.getProperty("serverURL")); 
	} 
	    	
	//Test steps to validate the "When he executes a trip plan from North Sydney Station to Town Hall Station"
	@When("^he executes a trip plan from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void he_executes_a_trip_plan_from_to(String arg1, String arg2) throws Throwable {
		
		driver.findElement(By.id("search-input-From")).sendKeys(tstData.getProperty("fromstation"));
		wait=new WebDriverWait(driver,10);
		fromLocation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("suggestion-From-0")));
		fromLocation.click();
				
		driver.findElement(By.id("search-input-To")).sendKeys(tstData.getProperty("tostation"));
		toLocation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("suggestion-To-0")));
		toLocation.click();
		driver.findElement(By.id("search-button")).click();
		
	}

	//Test steps to validate the "a list of trips should be provided"
	@Then("^a list of trips should be provided$")
	public void a_list_of_trips_should_be_provided() throws Throwable {
		List<WebElement> tripList=driver.findElements(By.xpath(expr));
		Assert.assertFalse(tripList.isEmpty());	
	}
		
	//This is a test tear down method which runs after each scenario
	@After	
	public void tearDown() {
		utils.closeBrowser();
	}
		
		
}
