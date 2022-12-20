package test.day14;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {

    @Test
    public void test01(){

        //amazon sayfasına gidiniz
        //sayfadaki tüm cookies leri listeleyin
        //sayfadaki tüm cookies sayısının 5'Den büyük oldugunu test edin
        //ismi i18n-prefs olan cooki değerinin usd oldugunu test edin
        //isimi " en sevdigim cookie " ve degeri "çikolatalı" olan bir cookie oluturun ve sayfaya ekleyin
        //klediginiz cookie nin sayfaya eklendigini test edin
        //ismi skin olan cookie yi silin ve silindigini test edin
        //tüm cookie leri silin ve silindigini test edin

        driver.get("https://amazon.com");
      Set<Cookie> cookieSet= driver.manage().getCookies();
        System.out.println(cookieSet);
    }
}
