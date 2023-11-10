import com.junit.Operations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test03_AssertUsing {
    private final Operations operations= new Operations();
    @Test
    void standartAsseritons(){
        assertEquals(14,operations.total(9,5));
        assertEquals(45,operations.multiplication(5,9));
        assertTrue(operations.multiplication(9,5)==45);
    }
    @Test
    void groupAssertions(){
        assertAll("Seri kontrol",()->assertEquals(5,operations.total(3,2)),
                ()->assertTrue(20>operations.division(200,4)));
    }
}
