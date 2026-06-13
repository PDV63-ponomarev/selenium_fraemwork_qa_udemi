package tests.searchapartments;

import org.testng.annotations.Test;

//запуск теста
// nvn clean test -DtestngXML=testng2.xml

public class TestOUT2 {

    @Test(enabled = false)
    public void testOUT(){
        System.out.println("TEST OUT2!!");
    }

//    указывает время на выполнение
    @Test(timeOut = 5000 )
    public void testOUT3(){
        System.out.println("TEST OUT3!!");
    }

//    тест выполняется 2 раза
    @Test(invocationCount = 2)
    public void testDouble(){
        System.out.println("Double test");
    }

}
