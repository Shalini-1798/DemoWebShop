package demowebshop_app.functionalitytest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demowebshop_app.Basepackage.Baseclass;
import demowebshop_app.utilitypackage.Readmultipleexcel;
import demowebshop_app.utilitypackage.Readproperties;

public class LoginfunctonaityTest extends Baseclass{
	@DataProvider
	public Object[][] dataSupplier() {
		Readmultipleexcel read = new Readmultipleexcel();
		Object[][] data = read.fetchexcelvalue("Sheet1");
		return data;
	}

	@Test(dataProvider = "dataSupplier")
	public void loginTest(String username, String password) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Readproperties read1 = new Readproperties();
		String url = read1.fetchproperties("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);

		driver.close();
	}

}
