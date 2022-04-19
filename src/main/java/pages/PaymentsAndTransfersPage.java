package pages;

import org.openqa.selenium.WebDriver;
import service.Steps;

public class PaymentsAndTransfersPage extends Steps {
    public static final String TO_ANOTHER_CLIENT = "//a[@href='/payments/internal']";

    public static void paymentToAnotherClient(WebDriver driver){
        clickOnObject(driver, TO_ANOTHER_CLIENT);
    }
}
