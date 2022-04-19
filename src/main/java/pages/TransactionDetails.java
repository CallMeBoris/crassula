package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class TransactionDetails extends Steps {
    public static final String AMOUNT = "//div[@class='summary__amount']";
    public static final String ACC_NUM = "//div[text()='Beneficiary account number']/following::div[1]";
    public static final String DESCRIPTION = "//div[text()='Description']/following::div[1]";

    public static final String CLOSE_BTN = "//button[@class='dialog-close']";

    public static void closeWindow(WebDriver driver){
        clickOnObject(driver, CLOSE_BTN);
    }
}
