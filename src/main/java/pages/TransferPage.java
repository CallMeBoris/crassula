package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class TransferPage extends Steps {
    public static final String AMOUNT = "//input[@id='amount']";
    public static final String CURRENCY_BTN = "//mat-select[@role='combobox']";
    public static final String USD = "//span[text()='USD']";
    public static final String ACC_NUM = "//input[@formcontrolname='recipientAccount']";
    public static final String DESCRIPTION = "//textarea[@formcontrolname='details']";
    public static final String TEMPLATE = "//input[@formcontrolname='templateName']";
    public static final String BUSY_BTN = "//button[@class='btn btn--brand ng-dirty ng-touched ng-pending is-busy']";
    public static final String CONTINUE_BTN = "//button[text()='Continue']";

    public static final String SUM = "3.57";
    public static final String ACC_NUM_DATA = "16258069471";
    public static final String DESCRIPTION_DATA = "payment in usd to friend";
    public static final String TEMPLATE_DATA = "testTemplate";
    public static final String AMOUNT_DATA = "-" + SUM + " USD";

    public static void createTransfer(WebDriver driver){
        setData(driver, AMOUNT, SUM);
        clickOnObject(driver, CURRENCY_BTN);
        clickOnObject(driver, USD);
        setData(driver, ACC_NUM, ACC_NUM_DATA);
        setData(driver, DESCRIPTION, DESCRIPTION_DATA);
        setData(driver, TEMPLATE, TEMPLATE_DATA);
        while (isExist(driver, BUSY_BTN)){}
        clickOnObject(driver, CONTINUE_BTN);
    }
}
