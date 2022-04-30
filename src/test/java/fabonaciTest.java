import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fabonaciTest {
    Fabonaci fabonaci;

    @BeforeEach
    void setUp() {
        fabonaci = new Fabonaci();
    }

    @Test
    void shouldGet0WhenInput0() {
        assertEquals(0, fabonaci.getFb(0));
    }

    @Test
    void shouldGetBaseValue() {
        assertEquals(1, fabonaci.getFb(1));
        assertEquals(1, fabonaci.getFb(2));
    }



}