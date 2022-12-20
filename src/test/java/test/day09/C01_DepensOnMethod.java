package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_DepensOnMethod {

    //BİR CLASS OLUŞTURUN
    //https://www.amazon.com gidin
    // 1. TEST: AMAZON ANA SAYFASINA GİTTİGİNİZİ TEST EDİN
    //2. TEST: 1.TEST BAŞARILI İSE SEARCH BAX'İ KULLANARAJ "NUTELLA" İÇİN ARAMA YAPİN
    // ve aramanızın gerçekleştigini test edin
    //3.Test :"NUTELLA" için arama yapıldıysa ilk ürünü tıklayın ve fiyatınn 16.83$ oldugunu test edin


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");


    }

    @Test
    public void logoTest() {
        driver.get("https://amazon.com");
        WebElement logotesti= driver.findElement(By.id("nav-logo-sprites"));
        Assert.assertTrue(logotesti.isDisplayed());


    }

    @Test(dependsOnMethods = "logoTest")
    public void aramaTesti() {
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella"+ Keys.ENTER);
        String actualTitle=driver.getTitle();
        String  arananKelime="Nutella";
        Assert.assertTrue(actualTitle.contains(arananKelime));

   }

    @Test(dependsOnMethods = "aramaTesti")
    public void fiyatTesti() {
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();



    }

    @AfterClass
    public void teardown() {
              driver.close();
    }

   // driver.get("https://amazon.com");
   // WebElement logoElementi = driver.findElement(By.id("nav-logo-sprites"));
   //     Assert.assertTrue(logoElementi.isDisplayed());

}
