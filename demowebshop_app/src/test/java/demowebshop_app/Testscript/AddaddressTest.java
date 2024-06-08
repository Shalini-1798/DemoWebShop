package demowebshop_app.Testscript;

//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import demowebshop_app.Basepackage.Baseclass;
import demowebshop_app.genericutility.Webdriverutility;
import demowebshop_app.objectrepository.Homepage;
import demowebshop_app.objectrepository.Myaccountpage;
//@Listeners(demowebshop_app.ListenerImplementation.ListenerImplementation.class)
public class AddaddressTest extends Baseclass {
	@Test
	public void addAddress() {
		Webdriverutility web=new Webdriverutility();
		Homepage home=new Homepage(driver);
		web.toClick(home.getLink());
		test.log(Status.INFO, "CLICK ON MY PROFILE");
		Myaccountpage acc=new Myaccountpage(driver);
		web.toClick(acc.getAddress());
		test.log(Status.INFO, "click on address");
		web.toClick(acc.getAddnew());
		test.log(Status.INFO, "click on newaddress");
		web.toSendTheText(acc.getFirstname(), "shalini");
		web.toSendTheText(acc.getLastname(), "rajappa");
		web.toSendTheText(acc.getEmailid(), "shalu@gmail.com");
		web.toSendTheText(acc.getCompany(), "demowebshop");
		web.selectByVisibleText(acc.getCountry(), "India");
		web.toSendTheText(acc.getCity(), "chennai");
		web.toSendTheText(acc.getAddress1(), "70 ashok nagar ");
		web.toSendTheText(acc.getAddress2(), "ganapathi street");
		web.toSendTheText(acc.getZippostal(), "123455");
		web.toSendTheText(acc.getPhonenumber(), "1234567890");
		web.toSendTheText(acc.getFaxnumber(), "46789");
		test.log(Status.INFO, "enter all the details");
		web.toClick(acc.getSave());
	}
	

}
