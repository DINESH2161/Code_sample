package launch_url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data1 {
	
	WebDriver driver;

	@Parameters("Browsers")
	@Test
	public void test1(String browser) {
		

		if(browser.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE")) {
			
			WebDriverManager.iedriver().setup();
			
			driver = new InternetExplorerDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
		}
		
		
		}
	
}
		
		
