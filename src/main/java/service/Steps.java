package service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.TransactionDetails;
import pages.TransferPage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Steps {

    public static void setData(WebDriver driver, String path, String data){
        WebElement element = driver.findElement(By.xpath(path));
        element.sendKeys(data);
    }

    public static void clickOnObject(WebDriver driver, String path) {
        WebElement element = driver.findElement(By.xpath(path));
        element.click();
    }

    public static boolean isExist(WebDriver driver, String path){
        return !driver.findElements(By.xpath(path)).isEmpty();
    }

    public void saveToCSV(WebDriver driver){
        try (PrintWriter writer = new PrintWriter("test.csv")) {
            writer.write(driver.findElement(By.xpath(TransactionDetails.ACC_NUM)).getText());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void assertTransfer(WebDriver driver){
        Assert.assertEquals(driver.findElement(By.xpath(TransactionDetails.AMOUNT)).getText(), TransferPage.AMOUNT_DATA);
        Assert.assertEquals(driver.findElement(By.xpath(TransactionDetails.ACC_NUM)).getText(), TransferPage.ACC_NUM_DATA);
        Assert.assertEquals(driver.findElement(By.xpath(TransactionDetails.DESCRIPTION)).getText(), TransferPage.DESCRIPTION_DATA);
    }

    public void goToHistory(WebDriver driver){
        driver.get(Utils.HISTORY_PAGE);
    }
}
