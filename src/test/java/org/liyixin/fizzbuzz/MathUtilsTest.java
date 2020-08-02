package org.liyixin.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    public void getDigitTest() {
        assertEquals(0, MathUtils.getDigit(0));
        assertEquals(1, MathUtils.getDigit(1));
        assertEquals(2, MathUtils.getDigit(12));
        assertEquals(3, MathUtils.getDigit(123));
        assertEquals(10, MathUtils.getDigit(Integer.MAX_VALUE));
        assertEquals(10, MathUtils.getDigit(Integer.MIN_VALUE));
    }

    @Test
    public void powTest() {
        assertEquals(4, MathUtils.pow(2,2));
        assertThrows(IllegalArgumentException.class, () -> MathUtils.pow(2,-2));
    }

    @Test
    public void containsTest() {
        assertTrue(MathUtils.contains(120, 2));
        assertFalse(MathUtils.contains(120, 3));
        assertTrue(MathUtils.contains(1351, 35));
        assertFalse(MathUtils.contains(1351, 36));
    }
}