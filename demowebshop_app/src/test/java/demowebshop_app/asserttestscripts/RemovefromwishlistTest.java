package demowebshop_app.asserttestscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import demowebshop_app.Basepackage.Baseclass;

public class RemovefromwishlistTest extends Baseclass {
	@Test
	public void removefromwishlist() {
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(driver.getCurrentUrl().contains("https://demowebshop.tricentis.com/wishlist"), true);
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.name("updatecart")).click();
		soft.assertAll();
	}

}
