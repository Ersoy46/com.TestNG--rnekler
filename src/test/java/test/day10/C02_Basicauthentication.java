package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Basicauthentication {

    //https://the-internet.herokuapp.com/basic_auth sayfasına gidiniz
    //aşagıdaki yöntem ve test detaylarını kullanarak authentication'i yapın
    //
    //Html kodu :https://username:pasword@URL
    //Username : admin
    //Pasword : admin
    //
    //4- başarılı şekilde sayfaya girildigini dogrulayın...

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void authenticationTesti() throws InterruptedException {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(3000);
    }

    @AfterClass
    public void teardown() {
        driver.close();
    }


}
