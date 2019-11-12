package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Re_run_browser {
	
	@Test
	public void launch_browser() {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("emai")).sendKeys("vijaykum@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.id("loginbutton")).click();
		
	}

	

}
