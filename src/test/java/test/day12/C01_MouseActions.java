package test.day12;

import org.testng.annotations.Test;
import utilities.TestBase;


public class C01_MouseActions extends TestBase {

    @Test
    public void test() {

        //1- Yeni bir class olusturalim: C03_MouseActions1
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }
}