package demowebshop_app.Testscript;

//import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demowebshop_app.Basepackage.Baseclass;
import demowebshop_app.genericutility.Webdriverutility;
import demowebshop_app.objectrepository.Addtocart;
import demowebshop_app.objectrepository.Homepage;

@Listeners//(demowebshop_app.ListenerImplementation.ListenerImplementation.class)
public class AddtocartTest extends Baseclass{
	@Test
	public void addToCart() {
		
		Webdriverutility web=new Webdriverutility();
		Homepage home=new Homepage(driver);
		web.toClick(home.getComputer());
		Addtocart cart=new Addtocart(driver);
		web.toClick(cart.getAddtocard());
		
		
	}
}
