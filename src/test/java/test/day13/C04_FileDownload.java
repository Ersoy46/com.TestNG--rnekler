package test.day13;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {
    // 1. Tests packagenin altina bir class oluşturalim : C04_FileDownload
    //2. Iki tane metod oluşturun : isExist() ve downloadTest()
    //3. downloadTest () metodunun icinde aşağıdaki testi yapalim:
    //		- https://the-internet.herokuapp.com/download adresine gidelim.
    //		- logo.png dosyasını indirelim
    //4. Ardından isExist()  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
    // "C:\Users\Lenovo\Downloads\logo.png"

    @Test
    public void isExist() {
        String logodownload=System.getProperty("user.home") + "\\Downloads\\logotitle.png";
        System.out.println("logo dosya yolu burada : " + logodownload);
        Assert.assertTrue(Files.exists(Paths.get(logodownload)));
    }

    @Test
    public void downloadTest() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[.='logotitle.png']")).click();
        Thread.sleep(3000);
    }
}
