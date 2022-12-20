package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Allerts {
    //  //https://the-internet.herokuapp.com/javascript_alerts   adresine gidin
    //  Bir method oluşturun
    //  1.Buttona tıklayın,uyaridaki OK butonuna tıklayın ve result mesajının
    //          "You succesfully clicked on alert" oldugunu test edin
    //  Bir method oluşturun:DismissAlert
    //  2.Butona tıklayın,uyaridaki concel tuşuna tıklayın ve Result mesajının
    //          "Succecfuly" içermedigini test edin
    //  Bir method oluşturun: : SendKeysAlert
    //  3. butona tıklayın,uyaridaki metin kutusuna isminizi yazın
    //          OK butonuna tıklayın ve result mesajında isminizin görüntülendigini dogrulayın

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }

    @Test
    public void accertAllertTesti() {
        WebElement birincibutton= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        birincibutton.click();
        driver.switchTo().alert().accept();
        WebElement sonucyazisielementi= driver.findElement(By.xpath("//p[@id='result']"));
        String actualsonucyazisi=sonucyazisielementi.getText();
        String expettedsonucyazisi="You successfully clicked an alert";
        Assert.assertEquals(actualsonucyazisi,expettedsonucyazisi);


    }

    //  @Test
    //  public void dismissAllertTesti(){

    //  }

    //  @Test
    //  public void sendKeysAllertTesti(){

    //   }

}





