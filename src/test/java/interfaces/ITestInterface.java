package interfaces;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ITestInterface {
    //implemente eden class'ın test zamanlarını öğrenebiliriz.

    default void beforeAllTest(){
        System.out.println("TEST BAŞLADI..."+ System.currentTimeMillis());

    }
    default void afterAllTest(){
        System.out.println("TEST BİTTİ..."+ System.currentTimeMillis());

    }
    default void beforeEachTest(){
        System.out.println("BİRİM TESTİ BAŞLADI..."+ System.currentTimeMillis());

    }
    default void afterEachTest(){
        System.out.println("BİRİM TESTİ BİTTİ..."+ System.currentTimeMillis());

    }
}
