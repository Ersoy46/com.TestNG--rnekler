package test.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C02_WindowHandle extends TestBase {
    //● https://the-internet.herokuapp.com/windows adresine gidin.
    //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //● Click Here butonuna basın.
    // bu satirda 2.window acildi
    //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    //● Sayfadaki textin “New Window” olduğunu doğrulayın.
    //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement texterişim= driver.findElement(By.xpath("//h3[.='Opening a new window']"));
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(texterişim.getText(), "Opening a new window");

softAssert.assertEquals(driver.getTitle(), "The Internet");
        String handledegeri1=driver.getWindowHandle();
driver.findElement(By.xpath("//a[text()='Click Here']")).click();
String handleDegeri1=driver.getWindowHandle();
        System.out.println(handleDegeri1);

        softAssert.assertAll();
    }
}
