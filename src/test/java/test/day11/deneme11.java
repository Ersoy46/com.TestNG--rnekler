package test.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class deneme11 extends TestBase {
    @Test
    public void test01(){
        driver.get("https://youtube.com");
        WebElement aramatusu= driver.findElement(By.xpath("//input[@id='search']"));

    aramatusu.sendKeys("bergen kurtar yarab");
    aramatusu.submit();
    WebElement bergensarki= driver.findElement(By.xpath("(//img[@class='yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded'])[1]"));

    bergensarki.click();
    }
}
