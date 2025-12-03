import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll  // в начале всех тестов
    static void beforeALl(){
        System.out.println("before");
    }

    @BeforeEach // в начале КАЖДОГО теста
    void beforeEach(){
        System.out.println("    Each");
    }

    @AfterAll // в конце всех тестов
    static void afterALl(){
        System.out.println("Finish all");
    }

    @AfterEach  // в конце КАЖДОГО теста
    void afterEach(){
        System.out.println("Finish part");
    }

    @Test
    void firstTest(){
        System.out.println("        UnoS");
    }

    @Test
    void secondTest(){
        System.out.println("        Cuadros");
    }
}
