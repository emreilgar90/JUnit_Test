import interfaces.ITestInterface;
import org.junit.jupiter.api.Test;

public class test04_TestInterface implements ITestInterface {
    @Test
    void testDeneme() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Burada calisir");
    }
    @Test
    void testDeneme2() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Burada calisir");
    }
}
