package tests.base;

import comman.CommonAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realhome.RealHomePage;

import java.time.Duration;
import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealHomePage realHomePage = new RealHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    @AfterSuite(alwaysRun = true)
    public void quite(){
        driver.quit();
    }


// открытие новой вкладки
    protected void switchWindow2(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String window1 = driver.getWindowHandle();

        js.executeScript("window.open()");

        Set<String> currectWindows = driver.getWindowHandles();

        String window2 = null;

        for(String window : currectWindows){
            if(!window.equals(window1)){
                window2 = window;
                break;
            }
        }
        driver.switchTo().window(window2);
    }

//    взаимод с диалог окнами
     protected void switchWindow(){
         Alert alert = wait.until(ExpectedConditions.alertIsPresent());
         driver.switchTo().alert();
         alert.accept();
     }
}
