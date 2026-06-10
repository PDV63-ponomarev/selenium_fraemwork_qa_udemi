package comman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static comman.Config.INPLICIT_WAIT;
import static comman.Config.PLARFORM_AND_BRWOSER;

public class CommonAction {
    private  static WebDriver driver = null;

    private  CommonAction() {
        }

    public  static  WebDriver createDriver(){
        if (driver == null){
            switch (PLARFORM_AND_BRWOSER) {
                case "win_chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                default:
                    Assert.fail("Incorrect platform or browser: " + PLARFORM_AND_BRWOSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(INPLICIT_WAIT));
        }
        return driver;
    }
}
