package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferCompletedPage {
    public static final String TRANSFER_COMPLETED = "//mat-icon[text()='done']";

    public static void checkTransfer (WebDriver driver){
        driver.findElement(By.xpath(TRANSFER_COMPLETED));
    }
}
