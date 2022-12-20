package test.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class deneme222 extends TestBase {


    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        WebElement aramatusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramatusu.sendKeys("bardak kupa" + Keys.ENTER);
        WebElement bossbardak= driver.findElement(By.xpath("(//img[@class='s-image'])[3]"));
        bossbardak.click();
    }

}
