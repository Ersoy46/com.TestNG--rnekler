package test.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class deneme extends TestBase {
    @Test
    public void deneme() {
        driver.get("https://youtube.com");
        WebElement aramayoutube = driver.findElement(By.xpath("//input[@id='search']"));
       aramayoutube.sendKeys("java");
        aramayoutube.submit();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@style='display: none;']"));
          driver.switchTo().frame(iframe);
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        WebElement arama = driver.findElement(By.className("style-scope ytd-moving-thumbnail-renderer fade-in"));
       arama.submit();
    }
}

