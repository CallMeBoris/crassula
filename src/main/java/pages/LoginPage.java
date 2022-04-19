package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class LoginPage extends Steps {
    public static final String LOGIN = "//input[@type='email']";
    public static final String PASSWORD = "//input[@type='password']";
    public static final String SIGN_IN = "//button[@type='submit']";

    public static final String LOGIN_DATA = "QAno2FA@crassula.io";
    public static final String PASS_DATA = "V85lPdks6cUm6#RM^Zd";

    public static void login(WebDriver driver){
        setData(driver, LOGIN, LOGIN_DATA);
        setData(driver, PASSWORD, PASS_DATA);
        clickOnObject(driver, SIGN_IN);
    }
}
