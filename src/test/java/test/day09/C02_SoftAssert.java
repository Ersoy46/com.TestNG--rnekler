package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_SoftAssert {
    //https:zerowebappsecurity.com sayfasına gşdelim
    //Sign in butonuna basınız
    //login kutusuna "Username" yazın
    //pasword kutusuna "pasword" yazın
    //Sign in kutusuna basın
    //online banking menüsünden pay bills sayfasına gdin
    //"Purshace Foreign Currency" tusuna basın
    //"Currency" drop down menüsünden "Eoruzone" u seçin
    //softassert kullanarak "Eurozone(Euro)" seçildigini test edin
    //soft assert kullnarak drop down listesinin şu seçenekleri oldugunu test edin "Select one", "Australia(dolar)

    WebDriver driver;

    @BeforeClass
public void setUp(){
        WebDriverManager.chromedriver();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @Test
    public void test01(){
        driver.get("https:zerowebappsecurity.com");
    }
    //sayfaya gitmiyor açılmıyor....

























}
