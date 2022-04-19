package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class StartPage extends Steps {
    public static final String PAYMENTS_AND_TRANSFERS = "(//a[@href='/payments'])[2]";
    public static final String PROFILE_MENU = "//cl-profile-menu";
    public static final String SIGN_OUT = "(//cl-rich-option)[4]";

    public static void goToPaymentsAndTransfers(WebDriver driver){
        clickOnObject(driver, PAYMENTS_AND_TRANSFERS);
    }

    public static void logOut(WebDriver driver){
        clickOnObject(driver, PROFILE_MENU);
        clickOnObject(driver, SIGN_OUT);
    }
}
