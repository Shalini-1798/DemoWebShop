package demowebshop_app.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;



public class Homepage  extends Basepage{
	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindAll({@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div[3]/div/div[2]/h2/a"),@FindBy(xpath = "//a[@href='/141-inch-laptop' and text()='14.1-inch Laptop']")})
	private WebElement computer;
	
	public WebElement getComputer() {
		return computer;
	}
	@FindAll({@FindBy(partialLinkText = "shalinirajappa1798@gmail.co"),@FindBy(xpath = "//a[@class='account' and text()='shalinirajappa1798@gmail.com']")})
	private WebElement link;
	public WebElement getLink() {
		return link;
	}
	

	@FindAll({@FindBy(partialLinkText = "Log ou"),@FindBy(className = "ico-logout")})
	private WebElement logout;
    public WebElement getLogout() {
		return logout;
	}
	

}
