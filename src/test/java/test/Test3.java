package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Test3 extends BaseClass {

	
	
	@Test
	public void TEST1() {
		
		logger=extents1.createTest("TEST1");
		logger.log(Status.PASS, MarkupHelper.createLabel("TEST1 passed", ExtentColor.GREEN));
		
	}
	
	@Test
	public void TEST2() {
		
		logger=extents1.createTest("TEST2");
		logger.log(Status.PASS, MarkupHelper.createLabel("TEST2 passed", ExtentColor.GREEN));
		
	}
	@Test
	public void TEST3() {
		
		logger=extents1.createTest("TEST3");
		logger.assignCategory("Regression");
		logger.log(Status.FAIL, MarkupHelper.createLabel("TEST3 failed", ExtentColor.RED));
		
	}
	@Test
	public void TEST4() {
		logger.assignCategory("Regression");
		logger=extents1.createTest("TEST4");
		logger.log(Status.PASS, MarkupHelper.createLabel("TEST4 passed", ExtentColor.GREEN));
		
	}
	@Test
	public void TEST5() {
		logger.assignCategory("Sanity");
		logger=extents1.createTest("TEST5");
		logger.log(Status.FAIL, MarkupHelper.createLabel("TEST5 failed", ExtentColor.RED));
		
	}
}
