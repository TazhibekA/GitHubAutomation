package com.epam.ta.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CalculatorPage extends  AbstractPage{

    public CalculatorPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getUrl()
    {
        return driver.getCurrentUrl();
    }

    public CalculatorPage fillOutComputeEngine() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@ng-model = \"listingCtrl.computeServer.quantity\"]")));
        driver.findElement(By.xpath("//input[@ng-model = \"listingCtrl.computeServer.quantity\"]")).sendKeys("4");

        driver.findElement(By.xpath("//md-select[@ng-model = \"listingCtrl.computeServer.series\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select_container_91\"]//md-option[1]")));
        driver.findElement(By.xpath("//*[@id=\"select_container_91\"]//md-option[1]")).click();

        driver.findElement(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.instance\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-option[@value=\"CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8\"]")));
        driver.findElement(By.xpath("//md-option[@value=\"CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-checkbox[@ng-model=\"listingCtrl.computeServer.addGPUs\"]")));
        driver.findElement(By.xpath("//md-checkbox[@ng-model=\"listingCtrl.computeServer.addGPUs\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.gpuType\"]")));
        driver.findElement(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.gpuType\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-option[@id=\"select_option_406\"]")));
        driver.findElement(By.xpath("//md-option[@id=\"select_option_406\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.gpuCount\"]")));
        driver.findElement(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.gpuCount\"]")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select_container_397\"]//md-option[2]")));
        driver.findElement(By.xpath("//*[@id=\"select_container_397\"]//md-option[2]")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@ng-model=\"listingCtrl.computeServer.ssd\"]")));
        driver.findElement(By.xpath("//*[@ng-model=\"listingCtrl.computeServer.ssd\"]")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select_container_358\"]//md-option[3]")));
        driver.findElement(By.xpath("//*[@id=\"select_container_358\"]//md-option[3]")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@ng-model=\"listingCtrl.computeServer.location\"]")));
        driver.findElement(By.xpath("//*[@ng-model=\"listingCtrl.computeServer.location\"]")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select_container_95\"]//md-option[10]")));
        driver.findElement(By.xpath("//*[@id=\"select_container_95\"]//md-option[10]")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.cud\"]")));
        driver.findElement(By.xpath("//md-select[@ng-model=\"listingCtrl.computeServer.cud\"]")).click();
        Thread.sleep(2000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"select_container_102\"]//md-option[2]")));
        driver.findElement(By.xpath("//*[@id=\"select_container_102\"]//md-option[2]")).click();
        Thread.sleep(2000);

        WebElement btn = driver.findElement(By.xpath("//*[@ng-click=\"listingCtrl.addComputeServer(ComputeEngineForm);\"]"));
        wait.until(ExpectedConditions.elementToBeClickable(btn));
        btn.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("compute")));
        return this;
    }

    public CalculatorPage switchToFrameByName(String name){
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"cloud-site\"]/devsite-iframe/iframe")));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@id=\"myFrame\"]")));
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        for(WebElement element : elements){
            if(element.getAttribute("id") == name) {
                driver.switchTo().frame(element);
            }
        }
        return this;
    }


}
