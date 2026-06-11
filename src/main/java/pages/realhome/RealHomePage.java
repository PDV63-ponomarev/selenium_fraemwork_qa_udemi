package pages.realhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.base.BasePage;

import java.time.Duration;

public class RealHomePage extends BasePage {
    public RealHomePage(WebDriver driver){
        super(driver);
    }

    By countRooms = By.xpath("//*[contains(@class, 'relative')]//*[text()='Кол-во комнат']");
    By option2rooms = By.xpath("//*[@role='button' and text()='2к квартира']");
    By findBtn = By.xpath("//*[contains(@class, 'flex')]/*[text()='Найти']");

    public RealHomePage enterCountRooms(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(countRooms)).click();
//        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();
        return this;
    }

    public RealHomePage clickToFind(){
        driver.findElement(findBtn).click();
        return this;
    }




}
