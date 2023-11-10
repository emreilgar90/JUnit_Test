import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test01_lifecycle {
    /**BeforeEach ve BeforeAfter her test den önce ve sonra çalışıyor.*/


    /**İlk çalışamada bir kere çalışır ve tekrar etme*/
    @BeforeAll
    void initAll(){
        System.out.println("1.adim BeforeAll");

    }
    /**Her defasında çalışır.Her testen önce tekrar eder.*/
    @BeforeEach
    void init(){
        System.out.println("2.adim BeforeEach");

    }
    @Test
    void ornekBasariliTest(){
        System.out.println("TEST tamamlandı.");
    }
    @Test
    void ornekBasarisizTest(){
        fail("Test basarisiz !!!");
        System.out.println("TEST basarisiz");
    }
    @Test
    //@Disabled ---> İSTEDİĞİMİZ ZAMAN TESTİ DEVRE DIŞI BIRAKMAK İÇİN
    void ornekKapatilmisTest(){
        System.out.println("TEST ORNEGI");
    }
    @Test
    void abortedTest(){
        assertEquals(8,"EMRE".length());
        fail("İptal edildi.");
    }
    @AfterEach
    void sonCalisan(){
        System.out.println("AfterEach.Son tekrar tekrar calisan komutlar.");
    }
    @AfterAll
    void tumTestlerTamamlandigindeCalisir(){
        System.out.println("AfterAll.Son calisir.");
    }


}
