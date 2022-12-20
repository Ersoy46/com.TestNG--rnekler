package test.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileExists {

    @Test
    public void test01(){
        System.out.println(System.getProperty("user.home"));

        //masa üstündeki klasörü bulmak için
       String path= System.getProperty("user.home") + "\\Desktop\\denemeday13\\selenium.txt";
        System.out.println(path);

        System.out.println("user.dir yolu :"+System.getProperty("user.dir"));

        // Masa üstünde deneme klasörü içerisinde selenium isminde bir dosya oldugunu test edin

        String dosyaYolu=System.getProperty("user.home") + "\\Desktop\\denemeday13\\selenium.txt";

        Files.exists(Paths.get(dosyaYolu));

      //  C:\Users\Ertuğrul\IdeaProjects\com.TestNGBatch44\pom.xml

        System.out.println(System.getProperty("user.dir"));
        String pomPath=System.getProperty("user.dir")+ "\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(pomPath)));
    }
}
