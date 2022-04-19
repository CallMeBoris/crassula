import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


public class PaymentTest extends TestBase {

    @Test
    public void testTransferToAnotherClient() {
        LoginPage.login(driver);
        EnterCodePage.verify(driver);
        StartPage.goToPaymentsAndTransfers(driver);
        PaymentsAndTransfersPage.paymentToAnotherClient(driver);
        TransferPage.createTransfer(driver);
        ConfirmationPage.confirm(driver);
        EnterCodePage.verify(driver);
        TransferCompletedPage.checkTransfer(driver);
        steps.goToHistory(driver);
        HistoryPage.details(driver);
        Assert.assertEquals(driver.findElement(By.xpath(TransactionDetails.AMOUNT)).getText(), TransferPage.AMOUNT_DATA);
        Assert.assertEquals(driver.findElement(By.xpath(TransactionDetails.ACC_NUM)).getText(), TransferPage.ACC_NUM_DATA);
        Assert.assertEquals(driver.findElement(By.xpath(TransactionDetails.DESCRIPTION)).getText(), TransferPage.DESCRIPTION_DATA);
        steps.saveToCSV(driver);
        TransactionDetails.closeWindow(driver);
        StartPage.logOut(driver);
    }
}