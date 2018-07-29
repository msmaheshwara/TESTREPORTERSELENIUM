package test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mongodb.diagnostics.logging.Logger;

public class LoginTest {
	
	ExtentHtmlReporter reporter=new  ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");
	ExtentReports extents1;
	WebDriver driver=new FirefoxDriver();
	ExtentTest logger;
	
	
	@BeforeClass
	public void beforeclass1()
	{
		System.out.println("before class");
				extents1=new ExtentReports();
		extents1.attachReporter(reporter);
	}
	
	
	
	
	
	
	@Test
	public void test2() throws IOException
	{
	   logger=extents1.createTest("Login Test2");
	   logger.assignCategory("Regression");
		logger.info("Login to application2");
		logger.debug("debug message in between2");
		//logger.error("error message");
		logger.info("navigate to Entitlement page2");
				driver.get("https://flex1233-fno-uat.flexnetoperations.com/flexnet/logon.do");
		logger.info("access Login Page of FNO");
		//Assert.assertEquals(driver.getTitle(), "erewewr");
			
		logger.fail("ffgdgf");
	
		
		Assert.assertTrue(false);
		
		
	}

	@AfterMethod
	public void test(ITestResult result) throws IOException {
		
		if (result.getStatus() == ITestResult.FAILURE)
        {
            File screenShotPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            
            String testName=result.getName();
            String dest = System.getProperty("user.dir") +"//ErrorScreenshots//"+testName+".png";
           
            FileUtils.copyFile(screenShotPath,new File(dest));
            logger.log(Status.FAIL, MarkupHelper.createLabel(testName+" Test case FAILED due to below issues:", ExtentColor.RED));
            logger.fail(result.getThrowable());
            logger.info("Test case failed");
           logger.fail("Snapshot below: " + logger.addScreenCaptureFromPath(dest));
        }

	extents1.flush();
	driver.close();
		
		
	}
	
	 
  /*  @AfterMethod
    public void getResult(ITestResult result) throws IOException
    {
        if (result.getStatus() == ITestResult.FAILURE)
        {
            File screenShotPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\"+result.getName()+".png";
            
            FileUtils.copyFile(screenShotPath, new File(dest));
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
            logger.fail(result.getThrowable());
            logger.fail("Snapshot below: " + logger.addScreenCaptureFromPath(dest));
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
        	logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        else
        {
        	
        	logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
        	logger.skip(result.getThrowable());
        }
        extents1.flush();
    }
     */
}
