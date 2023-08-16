package Generic_Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.io.Files;

public class Ilistenerclass implements ITestListener 
{
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodname= result.getMethod().getMethodName();
		test = report.createTest(methodname);
		Reporter.log(methodname+" Test Script execution started ");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
	test.log(Status.PASS, methodname +"Test Script passed");
	Reporter.log(methodname+ " Test Script Passed ");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		EventFiringWebDriver driver = new EventFiringWebDriver(Base_Class.driver);
	File src = 	driver.getScreenshotAs(OutputType.FILE);
 String path= ".\\Screenshot\\failed.png";
 File dst = new File(path);
 try {
	Files.copy(src, dst);
} catch (IOException e) {
	
	e.printStackTrace();
}
 try {
test.addScreenCaptureFromPath(dst.getAbsolutePath());
} catch (Exception e) {

	e.printStackTrace();
}
		
	String methodname= result.getMethod().getMethodName();
	test.log(Status.FAIL, "Test Script failed");
	test.log(Status.FAIL, result.getThrowable());
	Reporter.log(methodname+"  Test Script is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}
	
	

}
