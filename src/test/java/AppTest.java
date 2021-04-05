import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    static App app;

    @BeforeAll static void declaration() {
        app = new App();
    }

    @Test void addTest() {
        int result = app.add(1, 2);
        assertEquals(3, result);
    }

    @Test void subTest() {
        int result = app.sub(5, 1);
        assertEquals(4, result);
    }

    @Test void mulTest() {
        int result = app.mul(4,2);
        assertEquals(8, result);
    }

    @Test void divTest() {
        int result = app.sub(5, 2);
        assertEquals(2.5, result);
    }
}