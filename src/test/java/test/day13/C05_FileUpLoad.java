package test.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_FileUpLoad extends TestBase {
    // https://the-internet.herokuapp.com/upload adresine gidin
    //chooseFile butonuna basın
    //Yuklemek istediginiz dosyayi secelim.
    //Upload butonuna basalim.
    //“File Uploaded!” textinin goruntulendigini test edelim.


    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement filesecButonu= driver.findElement(By.id("file-upload"));
        String dosyaYolu= System.getProperty("user.home")+ "\\Desktop\\denemeday13\\selenium.txt";

        filesecButonu.sendKeys(dosyaYolu);
    Thread.sleep(4000);
    driver.findElement(By.id("file-submit")).click();

    WebElement Filegörüntü= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(Filegörüntü.isDisplayed());


        driver.close();
    }

}
