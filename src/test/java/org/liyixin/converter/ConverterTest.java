package org.liyixin.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    public void testConvert() {
        Converter converter = new Converter(1);
        converter.setInputUnit(Unit.Foot);
        assertEquals(12, converter.convert());
    }
}