import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class test05_Parametre {

    @ParameterizedTest
    @ValueSource(strings = {"emreilgar"})
    void parametreKullanimi(String ifade){
        assertTrue(ifade.startsWith("e"));  //ifade e ile mi başlıyor.
    }
    @ParameterizedTest
    @ValueSource(strings = {"emreilgar","duygu","betül","sude"})
    void cokluparametreKullanimi(String ifade){
        assertTrue(ifade.startsWith("e"));  //ifade e ile mi başlıyor.
    }
    @ParameterizedTest
    @ValueSource(ints = {3,2,33,6,14})
    void cokluIntegerKullanimi(int sayi){
      assertTrue(sayi %2==1,"tek sayi değil");  //ifade e ile mi başlıyor.
    }

    @ParameterizedTest
    @CsvSource({
            "EMRE, 33",
            "ILGAR, 30",
            "DUYGU, 30"
    })
    void csvKullanimi(String user,int age){
        assertNotNull(user);
        System.out.println("KULLANICI....: "+ user);
        assertTrue(age>18);
    }

    @ParameterizedTest
    @CsvFileSource(resources ="/kullanicilistesi.csv" )
    void csvFileSourceKullanimi(String user,int age,String adres){
        assertNotNull(user);
        System.out.println("KULLANICI....: "+ user);
        System.out.println("KULLANICI....: "+ adres);
        assertTrue(age>18);

    }

    @ParameterizedTest
    @CsvFileSource(files ="C:\\Users\\emrei\\IdeaProjects\\JUnit_Test\\src\\test\\resources\\kullanicilistesi.csv" ) //gibi isimlendirme yapmak lazım.
    void csvFileSourceKullanimi2(String user,int age,String adres){
        assertNotNull(user);
        System.out.println("KULLANICI....: "+ user);
        System.out.println("KULLANICI....: "+ adres);
        assertTrue(age>18);

    }
}
