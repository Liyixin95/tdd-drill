package org.liyixin.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    private static final double precision = 0.0001;

    @Test
    public void testFootToInch() {
        Converter converter = new Converter(1);
        converter.setInputUnit(Unit.Foot);
        assertTrue(converter.convert() - 12 <= precision);

        converter = new Converter(1.5);
        converter.setInputUnit(Unit.Foot);
        assertTrue(converter.convert() - 18 <= precision);

        converter = new Converter(1.1);
        converter.setInputUnit(Unit.Foot);
        assertTrue(converter.convert() - 13.2 <= precision);
    }

    @Test
    public void testInchToFoot() {
        Converter converter = new Converter(1);
        converter.setOutputUnit(Unit.Foot);
        assertTrue(converter.convert() - 0.08333 <= precision);

        converter = new Converter(1.5);
        converter.setOutputUnit(Unit.Foot);
        assertTrue(converter.convert() - 0.125 <= precision);

        converter = new Converter(1.1);
        converter.setOutputUnit(Unit.Foot);
        assertTrue(converter.convert() - 0.09166 <= precision);
    }

    @Test
    public void testYardToInch() {
        Converter converter = new Converter(1);
        converter.setInputUnit(Unit.Yard);
        assertTrue(converter.convert() - 36 <= precision);

        converter = new Converter(1.5);
        converter.setInputUnit(Unit.Yard);
        assertTrue(converter.convert() - 54 <= precision);

        converter = new Converter(1.1);
        converter.setInputUnit(Unit.Yard);
        assertTrue(converter.convert() - 39.6 <= precision);
    }

    @Test
    public void testInchToYard() {
        Converter converter = new Converter(1);
        converter.setOutputUnit(Unit.Yard);
        assertTrue(converter.convert() - 0.02777 <= precision);

        converter = new Converter(1.5);
        converter.setOutputUnit(Unit.Yard);
        assertTrue(converter.convert() - 0.04166 <= precision);

        converter = new Converter(1.1);
        converter.setOutputUnit(Unit.Yard);
        assertTrue(converter.convert() - 0.03055 <= precision);
    }
}