package service;

import org.openqa.selenium.*;
import pages.SmsPage;

public class PhoneCode {
    public static String getSmsCode(WebDriver driver){
        String handle = driver.getWindowHandle();
        String code;
        try{
        Thread.sleep(20000); //необходимо усыпить поток чтобы дождаться смс
        }catch (InterruptedException e){e.printStackTrace();}
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(Utils.SMS_PAGE);
        WebElement smsCode = driver.findElement(By.xpath(SmsPage.SMS_CODE));
        code = smsCode.getText().split(" ")[0];
        driver.close();
        driver.switchTo().window(handle);
    return code;
    }
}
