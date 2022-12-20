package test.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class C02_HandleDropDown {
    //dropdown da var olan seçeneklerden birini seçmek için
    //1. adim: Droptan web elementini locate edip bir değişkene atıyoruz.
    //2. adim: Select clasıından bir obje oluşturalım ve
    //parametre olarak locate ettiğimiz Webelementten oluşturalım.
    //3. adım : Select objesini kullanarak Select classından var olan 3 seçim methodundan
    //istediğimizi kullanarak dropdown da var olan option lardan istediğimizi seçebiliriz.
    // Seçim yapmamıza yardım eden bu 3 method void dir. Dolayısı ile bize birşey döndürmezler.
    //eğer seçtiğimiz option değerini yazdırmak istersek

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
    @Test
    public void dropdownTesti() throws InterruptedException {
        driver.get("https://www.amazon.com");
        WebElement dropdownelementi= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select=new Select(dropdownelementi);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(4000);

        select.selectByVisibleText("Deals");
        Thread.sleep(3000);

        select.selectByValue("search-alias=arts-crafts-intl-ship");

        List<WebElement>optionsList=select.getOptions();
        for (WebElement each:optionsList){
            System.out.println(each.getText());
        }

    }



@AfterMethod
    public void teardown(){
        driver.close();
}

}
