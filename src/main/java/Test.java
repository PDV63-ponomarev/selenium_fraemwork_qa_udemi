import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
//
//        WebElement input = driver.findElement(
//                By.cssSelector(".truncate")
//        );
//
//        WebElement input2 = driver.findElement(
//                By.xpath("//*[@class=\"truncate\"]")
//        );
//
//        WebElement input3 = driver.findElement(
//                By.className("truncate")
//        );


//        Неявное ожидание
//        ожидание на поиск
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//      время на загрузку страницы
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//       ожидания завершения выполнения асинхронного скрипта
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));


//       By input = By.xpath("//*[@class=\"truncate\"]");
//       WebElement element = driver.findElement(input);

//      Клик
//        WebElement element = driver.findElement(By.id("qwe"));
//        element.click();


//        ввод текста и нажатие ентер
//        element.sendKeys("автомобили", Keys.ENTER);
//        вложить файл
//        element.sendKeys("C://packege/file.txt", Keys.ENTER);
//
//
//        // получение текста
//        String name = element.getText();

//        свойства элемента
        By img = By.xpath("//svg[@aria-label='Google']");

        WebElement element = driver.findElement(img);

        System.out.println(element.getAttribute("src"));


    }
}
