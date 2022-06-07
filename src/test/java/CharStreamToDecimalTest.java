import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(36901, charStreamToDecimal.binaryStrToDecimal("1001000000100101"));
        assertEquals(2079309563, charStreamToDecimal.binaryStrToDecimal("1111011111011111011111011111011"));
    }

    @Test
    void getTrailingBitsWith1Char() {

    }

    @Test
    void getTrailingBitsWith3Chars() {
        assertEquals("000000100101", charStreamToDecimal.getTrailingBits("111010011000000010100101"));
        assertEquals("", charStreamToDecimal.getTrailingBits("111010011000000011100101"));
        assertEquals("", charStreamToDecimal.getTrailingBits("111010011100000011000101"));
    }

    @Test
    void getLeadingBitsWith1Char() {
        assertEquals("1011010", charStreamToDecimal.getLeadingBits("01011010"));
        assertEquals("", charStreamToDecimal.getLeadingBits("10001000"));
    }

    @Test
    void getLeadingBitsWith2Char() {
    }

    @Test
    void getLeadingBitsWith3Char() {
        assertEquals("1001", charStreamToDecimal.getLeadingBits("111010011000000010100101"));
        assertEquals("", charStreamToDecimal.getLeadingBits("011010011000000010100101"));
    }

    @Test
    void getLeadingBitsWith4Char() {
    }

    @Test
    void getLeadingBitsWith5Char() {
    }

    @Test
    void getLeadingBitsWith6Char() {
    }

    @Test
    void hexToBinaryWith3Chars() {
        assertEquals("111010011000000010100101", charStreamToDecimal.hexToBinary("E980A5"));
    }

    @Test
    void hexToBinaryWith6Chars() {
        assertEquals("111111111111111111111111111111111111111111111111", charStreamToDecimal.hexToBinary("FFFFFFFFFFFF"));
        assertEquals("111111011011101110111011101110111011101110111011", charStreamToDecimal.hexToBinary("FDBBBBBBBBBB"));
    }
}

