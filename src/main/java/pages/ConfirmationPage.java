package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class ConfirmationPage extends Steps {
    public static final String CONFIRM_BTN = "//button[text()='Confirm']";

    public static void confirm(WebDriver driver){
        clickOnObject(driver, CONFIRM_BTN);
    }
}
