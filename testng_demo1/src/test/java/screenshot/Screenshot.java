package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	WebDriver driver;

	@Test
	public void captureScreenShot() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("asdf");

		driver.findElement(By.id("pass")).sendKeys("1234");

		driver.findElement(By.id("loginbtn")).click();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			System.out.println("Failure" + result.getName());

			TakesScreenshot tks = (TakesScreenshot) driver;

			File src = tks.getScreenshotAs(OutputType.FILE);

			File dest = new File("./screenshot/" + result.getName()+ ".png");

			FileUtils.copyFile(src,dest);

		}

	}
}
