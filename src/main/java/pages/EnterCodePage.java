package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import service.PhoneCode;
import service.Steps;

public class EnterCodePage extends Steps {
    public static final String ENTER_CODE = "//input[@formcontrolname='code']";
    public static final String VERIFY = "(//button[@type='submit'])[2]";

    public static void verify(WebDriver driver){
        setData(driver, ENTER_CODE, PhoneCode.getSmsCode(driver));
        clickOnObject(driver, VERIFY);
    }
}
