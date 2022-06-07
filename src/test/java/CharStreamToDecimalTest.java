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
    void validateAndCalWithValidChars() {
        assertEquals(36901, charStreamToDecimal.validateAndCal("E980A5"));
    }

    @Test
    void validateAndCalWithInvalidChars() {
        assertEquals(-1, charStreamToDecimal.validateAndCal("C0C0"));
    }

    @Test
    void binaryStrToDecimal() {
    }

    @Test
    void getTrailingBits() {
    }

    @Test
    void getLeadingBitsWith1Char() {
    }

    @Test
    void hexToBinaryWith3Chars() {
        assertEquals("111010011000000010100101", charStreamToDecimal.hexToBinary("E980A5"));
    }
}