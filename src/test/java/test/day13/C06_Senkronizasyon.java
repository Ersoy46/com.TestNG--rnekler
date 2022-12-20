package test.day13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_Senkronizasyon extends TestBase {

    @Test
    public void test01(){
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //driver.findElement(By.id("file-submit")).click();


    }


}
