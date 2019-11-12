package testng_demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provider_sample {
	
	 WebDriver driver;

	@BeforeMethod
	public void launch_url() {

		WebDriverManager.chromedriver().setup();

	 driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	}

	@DataProvider(name = "test data")
	public String[][] data() {
		String[][] data = { { "vj123@gmail.com", "123" },
							{ "vj1234@gmail.com", "1234" },
							{ "vj12@gmail.com", "12" },
							{ "vj1@gmail.com", "1" } };
		return data;

	}

	@Test(dataProvider = "test data")
	public void test(String uname, String pwd) {
		driver.findElement(By.id("email")).sendKeys(uname);

		driver.findElement(By.id("pass")).sendKeys(pwd);

		driver.findElement(By.id("loginbutton")).click();


	}

}
