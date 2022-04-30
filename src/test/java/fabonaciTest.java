import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fabonaciTest {
    @Test
    void shouldGetBaseValue() {
        Fabonaci fabonaci = new Fabonaci();
        assertEquals(1, fabonaci.getFb(1));
        assertEquals(1, fabonaci.getFb(2));
    }

}