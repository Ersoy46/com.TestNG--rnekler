package test.day11;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_WindowHandle extends TestBase {

    // https://the-internet.herokuapp.com/windows adresine gidin.
// Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
   // ● Click Here butonuna basın.
    //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    //● Sayfadaki textin “New Window” olduğunu doğrulayın.
    //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

    @Test
    public void habndleWindow(){
        driver.get("https://amazon.com");
String handle1=driver.getWindowHandle();
        System.out.println(handle1);

    }
}
