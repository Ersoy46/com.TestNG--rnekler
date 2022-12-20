package test.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class deneme extends TestBase {
    @Test
    public void deneme() {
        driver.get("https://youtube.com");
        WebElement aramayoutube = driver.findElement(By.xpath("//input[@id='search']"));
        aramayoutube.sendKeys("java");
        aramayoutube.submit();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='about:blank']"));
        driver.switchTo().frame(iframe);
        WebElement arama = driver.findElement(By.xpath("(//div[@class='style-scope ytd-playlist-thumbnail'])[3]"));
       arama.click();
    }
}

