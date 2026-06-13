package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pages.base.BasePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//*[@aria-label='Карточка объекта в листинге']");

    public RealtListingPage checkCountCards(){
        waitElementVisible(driver.findElement(card));

        Assertion assertion = new Assertion();

        // проверка эквивалентности
        assertion.assertEquals(3,2, "Числа не равны");

//        assertion.assertTrue();
//        assertion.assertFalse();
//        assertion.assertNotEquals();

        // если будет ошибка, то тест не падает
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.

        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard, 30);
        return  this;
    }
}
