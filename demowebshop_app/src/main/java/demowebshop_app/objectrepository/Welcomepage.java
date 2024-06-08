package demowebshop_app.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Welcomepage   extends Basepage{
	public Welcomepage(WebDriver driver) { 
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindAll({@FindBy(partialLinkText = "Log in"),@FindBy(className = "ico-login")})
	private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
