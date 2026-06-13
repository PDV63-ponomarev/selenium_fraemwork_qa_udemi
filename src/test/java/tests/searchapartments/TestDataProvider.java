package tests.searchapartments;

import org.testng.annotations.Test;

public class TestDataProvider {

    @Test(dataProvider = "dataProviderMethod", dataProviderClass = DataProviderClass.class)
    public void testDataProvider(String number, String string){
        System.out.println("TEST DataProvider" + number + string);
    }

}
