import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Bu sinif kullanici veritabani icin testler sunar.")
public class test02_DisplayName {
    @Test
    @DisplayName("Kullanici adina göre tum kullanicileri listeler")
    void findAllUserNameTest(){
        System.out.println("Tum kullanici listesi listelendi.");
    }
}
