package tests.base;

import comman.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realhome.RealHomePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealHomePage realHomePage = new RealHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);

}
