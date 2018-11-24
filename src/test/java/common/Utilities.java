package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Common Utilities class
public class Utilities {
	private WebDriver driver;
	
	//Method to initiate Chrome Browser
	public WebDriver initializeDriver( ){
		System.setProperty("webdriver.chrome.driver","E:\\setup\\chromedriver_win32\\chromedriver.exe");
 	    driver = new ChromeDriver();
		return driver;
	}
	//Method to close the browser
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
	//Method to load the properties file
	public Properties loadPropertiesfile(){
		String propFilepath=".\\src\\test\\resources\\TestData\\data.properties";
		Properties propFile = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(propFilepath);
			// load a properties file
			propFile.load(input);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		} 
		return propFile;	
	}

}
