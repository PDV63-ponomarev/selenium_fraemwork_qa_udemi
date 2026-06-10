package tests.searchapartments;

import tests.base.BaseTest;

public class SeacrhApartTest extends BaseTest {

    public void checkIsRederectToListing(){

        basePage.open("https://realt.by");

        realHomePage
                .enterCountRooms()
                .clickToFind();

    }
}
