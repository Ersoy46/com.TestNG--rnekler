package test.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;

public class deneme963 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        //● Click Here butonuna basın.
        // bu satirda 2.window acildi
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement textdogrulama = driver.findElement(By.tagName("h3"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(textdogrulama, "Opening a new window");

        softAssert.assertEquals(driver.getTitle(), "The Internet");

        String handle1Degeri = driver.getWindowHandle();
        System.out.println(handle1Degeri);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();


        Set<String> tumhandleDegerleri = driver.getWindowHandles();
        String handleDegeri2 = driver.getWindowHandle();

        for (String each : tumhandleDegerleri
        ) {
            if (!each.equals(tumhandleDegerleri)) {
                each = handleDegeri2;
            }

        }
        driver.switchTo().window(handleDegeri2);
        System.out.println(handleDegeri2);

        softAssert.assertEquals(handleDegeri2, "New Window");
        WebElement sonsayfatext = driver.findElement(By.tagName("h3"));

        softAssert.assertEquals(sonsayfatext.getText(), "New Window");

        Thread.sleep(3000);
        driver.switchTo().window(handle1Degeri);

        softAssert.assertEquals(handle1Degeri, "The Internet");

        driver.quit();

    }
}
