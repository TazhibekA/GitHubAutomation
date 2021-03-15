package com.epam.ta.test;

import com.epam.ta.page.CalculatorPage;
import com.epam.ta.page.MainPage;
import com.epam.ta.page.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class SearchManagementTests extends CommonConditions {
    @Test
    public void canSearch(){
        SearchPage searchPage = new MainPage(driver)
                .openPage()
                .searchByText("Google Cloud Platform Pricing Calculator");

        Assert.assertTrue(searchPage.getUrl().equals("https://cloud.google.com/s/results?q=Google%20Cloud%20Platform%20Pricing%20Calculators"));
    }

    @Test
    public void canChooseInSearchList(){
        CalculatorPage calculatorPage = new MainPage(driver)
                .openPage()
                .searchByText("Google Cloud Platform Pricing Calculator")
                .chooseByText("Google Cloud Platform Pricing Calculator");

        Assert.assertTrue(calculatorPage.getUrl().equals("https://cloud.google.com/products/calculator"));
    }


}
