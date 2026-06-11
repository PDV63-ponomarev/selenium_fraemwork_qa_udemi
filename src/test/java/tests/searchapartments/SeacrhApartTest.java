package tests.searchapartments;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class SeacrhApartTest extends BaseTest {

    @Test
    public void checkIsRederectToListing(){

        basePage.open("https://realt.by");

        realHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage
                .checkCountCards();
    }
}
