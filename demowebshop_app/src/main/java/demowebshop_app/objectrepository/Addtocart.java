package demowebshop_app.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Addtocart  extends Basepage {
	public Addtocart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindAll({@FindBy(xpath = "//a[text()='14.1-inch Laptop']"),@FindBy(xpath = "//a[@href='/141-inch-laptop' and text()='14.1-inch Laptop']")})
	private WebElement computer;
	public WebElement getComputer() {
		return computer;
	}
	@FindAll({@FindBy(css = "[alt='Picture of 14.1-inch Laptop']"),@FindBy(xpath = "//a[@title='Show details for 14.1-inch Laptop']")})
	private WebElement compterimage;
	public WebElement getCompterimage() {
		return compterimage;
	}
	@FindAll({@FindBy(id = "add-to-cart-button-31"),@FindBy(className = "qty-input")})
	private WebElement addtocard;
	public WebElement getAddtocard() {
		return addtocard;
	}
	

}
