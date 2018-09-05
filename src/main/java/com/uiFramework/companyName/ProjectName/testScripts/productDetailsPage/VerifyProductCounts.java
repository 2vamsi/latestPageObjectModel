package com.uiFramework.companyName.ProjectName.testScripts.productDetailsPage;

import org.testng.annotations.Test;

import com.uiFramework.companyName.ProjectName.helper.assertion.AssertionHelper;
import com.uiFramework.companyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.companyName.ProjectName.pageObject.ApplicationText;
import com.uiFramework.companyName.ProjectName.pageObject.LoginPage;
import com.uiFramework.companyName.ProjectName.pageObject.NavigationMenu;
import com.uiFramework.companyName.ProjectName.pageObject.ProductCategoryPage;
import com.uiFramework.companyName.ProjectName.testbase.TestBase;


/**
 */
public class VerifyProductCounts extends TestBase{
	
	LoginPage loginPage;
	NavigationMenu navigationMenu;
	
	@Test
	public void testVerifyProductCounts(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		
		navigationMenu = new NavigationMenu(driver);
		ProductCategoryPage pCate = navigationMenu.clickOnMenu(navigationMenu.womenMenu);
		
		pCate.selectColor(ApplicationText.Orange);
		int count = pCate.getTotalProducts();
		
		if(count==4){
			AssertionHelper.markPass();
		}
		else{
			AssertionHelper.markFail("product count is not matching");
		}
	}
}
