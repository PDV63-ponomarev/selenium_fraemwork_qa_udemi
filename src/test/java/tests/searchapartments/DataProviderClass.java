package tests.searchapartments;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider
    public Object[][] dataProviderMethod(){
        return new Object[][]{
                {"1", "String"},
                {"2", "String2"},
                {"3", "String3"}
        };
    }
}
