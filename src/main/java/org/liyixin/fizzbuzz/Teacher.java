package org.liyixin.fizzbuzz;

/**
 * @author Liyixin
 */
public class Teacher {
    private final int fizz;
    private final int buzz;

    public Teacher(int fizz, int buzz) {
        if(fizz == buzz) {
            throw new IllegalArgumentException("fizz and buzz can not be equal");
        } else if(fizz == 0) {
            throw new IllegalArgumentException("fizz can not be zero");
        } else if(buzz == 0) {
            throw new IllegalArgumentException("buzz can not be zero");
        }

        this.fizz = fizz;
        this.buzz = buzz;
    }

    public int getFizz() {
        return this.fizz;
    }

    public int getBuzz() {
        return this.buzz;
    }
}
