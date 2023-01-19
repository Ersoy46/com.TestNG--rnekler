package test.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C01_Screenshot extends TestBase {

    @Test
    public void nutellaTesti() throws IOException {

        //amazın na sayfaya gidelim
        //nutella için arama yapalım
        //sonuçların nutella içerdigini test edelim
        //testin çalıştıgının ispatı için tüm sayfanın screenshot'ını alalım


     //  driver.get("https://amazon.com");
     //  WebElement aramakutus = driver.findElement(By.id("twotabsearchtextbox"));
     //  aramakutus.sendKeys("Nutella" + Keys.ENTER);

     //  WebElement sonucyazisi = driver.findElement(By.xpath("//div[@calss='a-section a-spacing-small a-spacing-top-small']"));
     //  String sonuc = sonucyazisi.getText();

     //  TakesScreenshot tss = (TakesScreenshot) driver;
     //  File tumSayfaSS = new File("target/screenshot/tumsayfa.png");
     //  File geciciSS = tss.getScreenshotAs(OutputType.FILE);
     //  FileUtils.copyFile(geciciSS, tumSayfaSS);


    }
}
