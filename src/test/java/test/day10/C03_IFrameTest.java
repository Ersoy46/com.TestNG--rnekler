package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_IFrameTest {

    //https:the-internet.herokuapp.com/iframe adresine gidiniz
    //Bir method oluşturun
    // -- " An Iframe containing.." textinin erişilebilir oldugunu test edin ve konsolda yazdırın
    // -- "Text box'a "merhaba dünya" yazdırın
    // -- Textbox'un altında bulunan "Elemantal Selenium" linkini tıklayın
    // yeni sayfada "sponsored by sauce labs" textinin görünür oldugunu dogrulayın ve konsolda yazdırın

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

@Test
    public void ıFrame(){
        driver.get("https:the-internet.herokuapp.com/iframe");
    WebElement containig= driver.findElement(By.tagName("h3"));
    SoftAssert softAssert=new SoftAssert();
    softAssert.assertTrue(containig.isEnabled());
    System.out.println(containig.getText());

    WebElement iframe= driver.findElement(By.tagName("iframe"));
    driver.switchTo().frame(iframe);
    WebElement textbox= driver.findElement(By.tagName("p"));
    textbox.clear();
    textbox.sendKeys("Merhaba Dünya");
    driver.switchTo().defaultContent();

driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();


    softAssert.assertAll();
}


@AfterClass
    public void teardown(){
        driver.quit();
}




}
