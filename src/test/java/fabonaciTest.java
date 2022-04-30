import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fabonaciTest {
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    void shouldGet0WhenInput0() {
        assertEquals(0, fibonacci.getFb(0));
    }

    @Test
    void shouldGetBaseValue() {
        assertEquals(1, fibonacci.getFb(1));
        assertEquals(1, fibonacci.getFb(2));
    }

    @Test
    void shouldGet3WhenInput4() {
        assertEquals(3, fibonacci.getFb(4));
    }

    @Test
    void shouldGet8WhenInput6() {
        assertEquals(8, fibonacci.getFb(6));
    }

}