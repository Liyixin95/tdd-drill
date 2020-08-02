package org.liyixin.converter;

/**
 * @author Liyixin
 */
public class Converter {

    private final double input;

    private Unit inputUnit = Unit.Inch;

    private Unit outputUnit = Unit.Inch;

    public Converter(double input) {
        this.input = input;
    }

    public double convert() {
        double inch = inputUnit.toInch(input);
        return outputUnit.fromInch(inch);
    }

    public Converter setInputUnit(Unit inputUnit) {
        this.inputUnit = inputUnit;
        return this;
    }

    public Converter setOutputUnit(Unit outputUnit) {
        this.outputUnit = outputUnit;
        return this;
    }
}
