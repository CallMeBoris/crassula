package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class HistoryPage extends Steps {
    public static final String DETAILS = "//div[@title='payment in usd to friend']";

    public static void details(WebDriver driver){
        clickOnObject(driver, DETAILS);
    }
}
