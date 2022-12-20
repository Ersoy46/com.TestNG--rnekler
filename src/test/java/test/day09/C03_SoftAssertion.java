package test.day09;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {

    @Test
    public void test(){
        int a=10;
        int b=20;
        int c=30;

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(a,b,"1.test başarısız");
        softAssert.assertTrue(a>b,"2.TEST BAŞARIZSI");
        softAssert.assertTrue(a<c,"3.TEST BAŞARIZSI");
        softAssert.assertTrue(c>b,"4.TEST BAŞARIZSI");
        softAssert.assertTrue(c<a,"5.TEST BAŞARIZSI");

        //assertAll DEMEZSEK CLASS ÇALIŞIR VE PASSED YAZAR ,ÇÜNKÜ RAPORLAMA YAPMAZ KODLAR ÇALIŞMIŞ OLUR

        softAssert.assertAll();
    }




}
