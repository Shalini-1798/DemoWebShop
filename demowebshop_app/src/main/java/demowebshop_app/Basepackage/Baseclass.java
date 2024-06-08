package demowebshop_app.Basepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import demowebshop_app.ListenerImplementation.ListenerImplementation;
import demowebshop_app.genericutility.Webdriverutility;
import demowebshop_app.utilitypackage.Readproperties;



public class Baseclass extends ListenerImplementation{
	 public WebDriver driver;
	 public static WebDriver sdriver;
	 Webdriverutility web=new Webdriverutility();
	 Readproperties read=new Readproperties();
	@BeforeClass
	public void openBrowser() {
        driver=new ChromeDriver();
        sdriver=driver;
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Readproperties read=new Readproperties();
		String Url=read.fetchproperties("url");
		driver.get(Url);
		Reporter.log("Browser is opened",true);
		
	}
	@BeforeMethod
	public void login(){
		Readproperties read=new Readproperties();
		String username=read.fetchproperties("username");
		String password=read.fetchproperties("password");
		driver.findElement(By.partialLinkText("Log i")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.cssSelector("[value='Log in']")).click();
		Reporter.log("dummy",true);
		
		Reporter.log("login is done",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.partialLinkText("Log ou")).click();
		Reporter.log("logout is opened",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		Reporter.log("Browser is closed",true);
	}
		

}
