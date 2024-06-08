package demowebshop_app.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage{
	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindAll({@FindBy(id = "Email"),@FindBy(className = "email")})
	private WebElement emailIdTextField;
	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}
	@FindAll({@FindBy(id = "Password"),@FindBy(className = "password")})
	private WebElement passwordTextField;
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	@FindAll({@FindBy(xpath ="//input[@class='button-1 login-button']"),@FindBy(xpath = "//input[@value='Log in']")})
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}

}
