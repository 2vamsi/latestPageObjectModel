package com.uiFramework.companyName.ProjectName.testScripts;

import org.testng.annotations.Test;

import com.uiFramework.companyName.ProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.ProjectName.testbase.TestBase;

public class Test1 extends TestBase{

	
	@Test
	public void testLogin(){
		AssertionHelper.markPass();
	}
	
	@Test
	public void testLogin1(){
		AssertionHelper.markFail();
	}
	
	@Test
	public void testLogin2(){
		AssertionHelper.markPass();
	}
	
	@Test
	public void testLogin3(){
		AssertionHelper.markFail();
	}
}
