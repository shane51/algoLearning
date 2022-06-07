import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharStreamToDecimalTest {
    CharStreamToDecimal charStreamToDecimal;
    @BeforeEach
    void setUp() {
        charStreamToDecimal = new CharStreamToDecimal();
    }

    @Test
    void validateAndCal() {
        assertEquals(36901, charStreamToDecimal.validateAndCal("E980A5"));
    }
}