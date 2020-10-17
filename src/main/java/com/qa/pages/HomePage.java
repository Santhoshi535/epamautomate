package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import com.qa.base.TestBase;
import com.qa.util.FindRatio;

public class HomePage extends TestBase {

	@FindBy(xpath = "//div[@class='state-name fadeInUp']")
	List<WebElement> cState;

	@FindBy(xpath = "//div[@class='cell statistic']/div[@class='delta is-confirmed']/following-sibling::div")
	List<WebElement> cConfirmed;

	@FindBy(xpath = "//div[@class='cell statistic']/div[@class='delta is-tested']/following-sibling::div")
	List<WebElement> cTested;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void findRatio() {
		FindRatio ratio= new FindRatio();
		ratio.flow(cState,cConfirmed,cTested);
	}
	

}
