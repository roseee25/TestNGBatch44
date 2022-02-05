package tests.day09;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class C03_SoftAssertion {

    @Test
    public void test(){
        int a=10;
        int b=20;
        int c=30;

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(a,b,"1.Test Basarisiz");//Failed
        softAssert.assertTrue(a>b,"2.Test Basarisiz");//Failed
        softAssert.assertTrue(a<c,"3.Test Basarisiz");//Passed
        softAssert.assertTrue(c>b,"4.Test Basarisiz");//Passed
        softAssert.assertTrue(c<a,"5.Test Basarisiz");//Failed


        // assertAll demezsek class calisir ve passed yazar , cunku aslinda raporlama yapmaz sadece kodlar calismis olur
        softAssert.assertAll();
        System.out.println("eger softassert'lerden fail olan varsa bu satir calismaz");
    }
}
