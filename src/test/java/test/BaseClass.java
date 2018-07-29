package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	
	public static ExtentHtmlReporter reporter=new  ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");
	public static ExtentReports extents1=new ExtentReports();
	public static ExtentTest logger;

	@BeforeSuite
	public void setUp(){
	extents1.attachReporter(reporter);
	




	}

	@AfterSuite
	public void tearDown(){
		
		extents1.flush();

	
	}

}
