package test.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class C03_DropDown {

    //https://the-internet.herokuapp.com/dropdown adresine gidin.


    //1.Index kullanarak Seçenek 1 i seçin ve yazdırın.


    //2.Value kullanarak Seçenek 2 yi seçin ve yazdırın.


    //3.Visiable Text(Görünen metin) kullanarak Seçenek 1 i seçin ve yazdırın.


    //4.Tüm dropdown değerleri yazdırın.
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement seçenek1 = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select = new Select(seçenek1);

        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(4000);

        select.selectByValue("2");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(3000);

        select.selectByVisibleText("Option 1");
        System.out.println(select.getFirstSelectedOption().getText());

        List<WebElement> optionList = select.getOptions();
        for (WebElement each : select.getOptions()
        ) {
            System.out.println(each.getText());
        }

        int actualsize = optionList.size();
        int expentedsize = 4;
        Assert.assertEquals(actualsize, expentedsize, "Opsiyon sayısı beklentileri karşılamıyor");
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }


}