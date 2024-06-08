package demowebshop_app.Extendreportspakcage;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import demowebshop_app.Basepackage.Baseclass;
@Listeners(demowebshop_app.ListenerImplementation.ListenerImplementation.class)
public class demoforextendreportsTest extends Baseclass{
	@Test
	public void demo(){
		ExtentSparkReporter spark=new ExtentSparkReporter("./Advanced reports/Demo.html");
		ExtentReports report=new ExtentReports();
		report.attachReporter(spark);
		ExtentTest test=report.createTest("TestName");
		test.log(Status.INFO, "Demo reports");
		test.log(Status.INFO, "Demo reports");
		test.log(Status.INFO, "Demo reports");
		test.log(Status.INFO, "Demo reports");
		test.log(Status.INFO, "Demo reports");
		test.log(Status.INFO, "Demo reports");
		report.flush();
	}

}
