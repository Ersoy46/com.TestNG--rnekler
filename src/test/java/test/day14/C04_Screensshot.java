package test.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;

public class C04_Screensshot extends TestBase {

    @Test
    public void screenshotTest() {
        driver.get("https://google.com");

        // ****tüm sayfanın screenshot'ını almak için***
        //1.adım
   //    TakesScreenshot tss = (TakesScreenshot) driver;
   //    File tumSayfaScreenshot = new File("src\\tumSayfa.png");
   //    tumSayfaScreenshot = tss.getScreenshotAs(OutputType.FILE);

    //    WebElement logoElementi= driver.findElement(By.xpath("//img[@alt='Google']"));
    //    File logoresmi=new File("src/logo.png");
    //    logoresmi=logoElementi.getScreenshotAs(OutputType.FILE);

    }
}
