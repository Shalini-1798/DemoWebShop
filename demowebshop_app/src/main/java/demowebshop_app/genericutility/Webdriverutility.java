package demowebshop_app.genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriverutility {
	// To fetch title
		public String toGetTheTitle(WebDriver driver) {
			return driver.getTitle();
		}

		// To fetch the current url
		public String toGetTheUrl(WebDriver driver) {
			return driver.getCurrentUrl();
		}

		// To perform the click
		public void toClick(WebElement element) {
			element.click();
		}

		// To send the keys
		public void toSendTheText(WebElement element, String text) {
			element.sendKeys(text);
		}

		// to accept the alert
		public void acceptAlert(WebDriver driver) {
			driver.switchTo().alert().accept();
		}

		// to dismiss the alert
		public void dismissAlert(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}

		// to get text from alert
		public void getTextFromAlert(WebDriver driver) {
			driver.switchTo().alert().getText();
		}

		// to send text to the alert
		public void sendTextToAlert(WebDriver driver, String text) {
			driver.switchTo().alert().sendKeys(text);
		}

		// to find what kind of dropDown
		public boolean isMultipleMethod(WebElement dropDown) {
			Select sel = new Select(dropDown);
			return sel.isMultiple();
		}

		// to select the drop down by index
		public void selectByIndex(WebElement dropDown, int index) {
			Select sel = new Select(dropDown);
			sel.selectByIndex(index);
		}

		// to select the drop down by value
		public void selectByValue(WebElement dropDown, String val) {
			Select sel = new Select(dropDown);
			sel.selectByValue(val);
		}

		// to select the drop down by visible text
		public void selectByVisibleText(WebElement dropDown, String visibleText) {
			Select sel = new Select(dropDown);
			sel.selectByVisibleText(visibleText);
		}

		// to deSelect the drop down by visible text
		public void deSelectByVisibleText(WebElement dropDown, String visibleText) {
			Select sel = new Select(dropDown);
			sel.deselectByVisibleText(visibleText);
		}

		// to deSelect the drop down by value
		public void deSelectByValue(WebElement dropDown, String val) {
			Select sel = new Select(dropDown);
			sel.deselectByValue(val);
		}

		// to deSelect the drop down by index
		public void deSelectByIndex(WebElement dropDown, int index) {
			Select sel = new Select(dropDown);
			sel.deselectByIndex(index);
		}

		// to deSelect the all selected in drop down
		public void deSelectByAll(WebElement dropDown) {
			Select sel = new Select(dropDown);
			sel.deselectAll();
		}

		// to move to the element
		public void toMoveToElement(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
		}

		// to click the web element
		public void toClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.click(element).perform();
		}

		// to perform the right click action
		public void toContextClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.contextClick(element).perform();
		}

		// to perform the scroll to action
		public void toScrollTo(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.scrollToElement(element).perform();
		}

		// to perform the double click actions
		public void toDoubleClick(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
		}

		// to perform the drag and drop actions
		public void toDragAndDrop(WebDriver driver, WebElement element, WebElement element2) {
			Actions act = new Actions(driver);
			act.dragAndDrop(element, element2).perform();
		}

		// to perform the click and hold actions
		public void toClickAndHold(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.clickAndHold(element).perform();
		}

		// to perform the release action
		public void toRelease(WebDriver driver, WebElement element) {
			Actions act = new Actions(driver);
			act.release(element).perform();
		}

		// to handle the frame by index
		public void frameByIndex(WebDriver driver, int index) {
			driver.switchTo().frame(index);
		}

		// to handle the frame by id and name attribute
		public void frameByIdOrName(WebDriver driver, String text) {
			driver.switchTo().frame(text);
		}

		// to handle the frame by web element
		public void frameByWebelement(WebDriver driver, WebElement element) {
			driver.switchTo().frame(element);
		}

		// to switch the driver focus to parent frame
		public void toParentFrame(WebDriver driver) {
			driver.switchTo().parentFrame();
		}

		// to switch the driver focus to main frame
		public void toDefaultContent(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		//to take a screenshot of a webpage
		public void totakescreenshotwebpage(WebDriver driver,String screenshotname) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File ss=ts.getScreenshotAs(OutputType.FILE);
			File path=new File("./Screenshots/"+screenshotname+".png");
			try {
				FileHandler.copy(ss, path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			//to take the screenshot of webelement
		public void toTakeScreenshotWebElement(WebElement element, String screenshotName) {
			File img = element.getScreenshotAs(OutputType.FILE);
			File path = new File("./Screenshots/"+screenshotName+".png");
			try {
				FileHandler.copy(img, path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			 
}