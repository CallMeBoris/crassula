import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import service.Steps;
import service.Utils;

import java.time.Duration;

public class TestBase {
    public WebDriver driver;
    protected Steps steps;

    @BeforeMethod
    protected void setUp(){
        WebDriverManager.chromedriver().browserVersion(Utils.DRIVER_VERSION).setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Utils.LOGIN_PAGE);
        steps = new Steps();
    }

    @AfterMethod
    protected void end(){driver.quit();}
}
