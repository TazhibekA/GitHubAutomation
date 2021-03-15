package com.epam.ta.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends AbstractPage
{

	public SearchPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public CalculatorPage chooseByText(String chosenText){
		driver.findElement(By.linkText(chosenText)).click();
		return new CalculatorPage(driver);
	}

	public String getUrl()
	{
		return driver.getCurrentUrl();
	}

}
