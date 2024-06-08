package demowebshop_app.objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Productdetailspage  extends Basepage{
	
	
	public Productdetailspage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindAll({@FindBy(id = "add-to-cart-button-31"),@FindBy(className = "qty-input")})
	private WebElement addtocard;
	
	public WebElement getAddtocard() {
		return addtocard;
	}

}
