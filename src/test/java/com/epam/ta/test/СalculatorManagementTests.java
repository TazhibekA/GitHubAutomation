package com.epam.ta.test;

import com.epam.ta.page.CalculatorPage;
import com.epam.ta.page.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class –°alculatorManagementTests extends CommonConditions{

    @BeforeMethod
    public void canFillOut() throws InterruptedException {
        CalculatorPage calculatorPage = new MainPage(driver)
                .openPage()
                .searchByText("Google Cloud Platform Pricing Calculator")
                .chooseByText("Google Cloud Platform Pricing Calculator")
                .switchToFrameByName("myFrame")
                .fillOutComputeEngine();
    }

    @Test
    public void checkVMClass(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[2]/div")).getText().contains("VM class: regular"));
    }

    @Test
    public void checkInstanceType(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[3]/div")).getText().contains("Instance type: n1-standard-8"));
    }

    @Test
    public void checkRegion(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[4]/div")).getText().contains("Region: Frankfurt"));
    }

    @Test
    public void checkCommitmentTerm(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"compute\"]/md-list/md-list-item[6]/div")).getText().contains("Commitment term: 1 Year"));
    }
}
