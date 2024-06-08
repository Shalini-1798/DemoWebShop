package demowebshop_app.asserttestscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demowebshop_app.Basepackage.Baseclass;

public class WishlistTest extends Baseclass{
	@Test
	public void wishlist() {
		driver.findElement(By.xpath("//div[@class='center-3']/div/div/div[3]/div[2]/div/div[2]/h2/a")).click();
		Assert.assertEquals(driver.getTitle().contains("$25 Virtual Gift Card"), true);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("hi");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("shalu@gmail.com");
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("hihi");
		driver.findElement(By.id("add-to-wishlist-button-2")).click();
		//String browser=System.getProperty("browser");
		Reporter.log("wishlisted",true);
	

}
}