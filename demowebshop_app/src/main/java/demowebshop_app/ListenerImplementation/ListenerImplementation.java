package demowebshop_app.ListenerImplementation;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import demowebshop_app.Basepackage.Baseclass;
import demowebshop_app.utilitypackage.Javautility;



public class ListenerImplementation implements ITestListener,ISuiteListener {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test; 
	@Override
	public void onStart(ISuite suite) {
		Javautility java=new Javautility();
		spark = new ExtentSparkReporter("./Advanced reports/" + suite.getName()+java.getSystemDate() + ".html");
		report = new ExtentReports();
		report.attachReporter(spark);
		Reporter.log(suite.getName()+"has started execution",true);
	}
	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
		test.log(Status.PASS, result.getName() + "has started execution");
		Reporter.log(result.getName()+" test script has started ",true);
	}
	@Override
	public void onFinish(ISuite suite) {
		test.log(Status.INFO, suite.getName() + "has been executed successfully");
		Reporter.log(suite.getName()+"suite execution finished",true);
		report.flush();
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getName() + "Test Script has Skipped");
		Reporter.log(result.getName()+" test  script skipped",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log(result.getName()+"has started Success",true);
	}
	@Override
	public void onTestFailure(ITestResult result) { 
		test.log(Status.FAIL, result.getName() + "Test script has failed and screenshot has been taken");
		Reporter.log(result.getName() + "has failed", true);
		Javautility java = new Javautility();
		//String screenShotPath = "./Failedtestscripts/" + result.getName() + java.getSystemDate() + ".png";
		TakesScreenshot ts = (TakesScreenshot) Baseclass.sdriver;

		File ss = ts.getScreenshotAs(OutputType.FILE);

		File path = new File("./Failedtestscripts/" + result.getName() + java.getSystemDate() + ".png");

		try {
			FileHandler.copy(ss, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//test.addScreenCaptureFromPath("." + screenShotPath);
	
   
}

}
