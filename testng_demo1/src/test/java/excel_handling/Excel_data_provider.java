package excel_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel_data_provider {

	File f;

	FileInputStream fis;

	XSSFWorkbook wb;

	@Test(dataProvider = "excel_data")
	public void launch_browser(String uname, String pwd) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\VIJAY VJ\\workspace\\testng_demo1\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys(uname);

		driver.findElement(By.id("pass")).sendKeys(pwd);

		driver.findElement(By.id("loginbutton")).click();

	}

	@DataProvider(name = "excel_data")
	public Object[][] data() {

		f = new File("E:\\login.xlsx");

		try {

			fis = new FileInputStream(f);

		}

		catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Sheet sh = wb.getSheetAt(0);

		int no_of_rows = sh.getPhysicalNumberOfRows();

		Object[][] data_row = new Object[no_of_rows][];

		for (int i = 1; i < no_of_rows; i++) {

			Row r = sh.getRow(i);

			int no_of_cells = r.getPhysicalNumberOfCells();

			data_row[i - 1] = new Object[no_of_cells];

			for (int j = 0; j < no_of_cells; j++) {

				data_row[i - 1][j] = r.getCell(j).getStringCellValue();

			}

		}
		return data_row;

	}

}