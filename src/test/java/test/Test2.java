package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Test2 extends BaseClass{
	
	
	@Test
	public void T1() {
		
		logger=extents1.createTest("T1");
		
		System.out.println("Running T1");
		logger.log(Status.PASS, MarkupHelper.createLabel("T1 passed", ExtentColor.GREEN));
		
	}
	
	@Test
	public void T2() {
		
		logger=extents1.createTest("T2");
		logger.log(Status.PASS, MarkupHelper.createLabel("T2 passed", ExtentColor.GREEN));
		
	}
	@Test
	public void T3() {
		
		logger=extents1.createTest("T3");
		logger.log(Status.FAIL, MarkupHelper.createLabel("T3 failed", ExtentColor.RED));
		
	}
	@Test
	public void T4() {
		
		logger=extents1.createTest("T4");
		logger.log(Status.PASS, MarkupHelper.createLabel("T4 passed", ExtentColor.GREEN));
		
	}
	@Test
	public void T5() {
		
		logger=extents1.createTest("T5");
		logger.log(Status.FAIL, MarkupHelper.createLabel("T5 failed", ExtentColor.RED));
		
	}
	

}
