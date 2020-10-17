package com.qa.testcases;

import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	TestUtil testUtil;

	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		initialization();
		testUtil = new TestUtil();
		homePage = new HomePage();
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		homePage.findRatio();
	}

	@AfterMethod
	public void tearDown(){
		// driver.quit();
	}

}
