package org.liyixin.fizzbuzz;

/**
 * @author Liyixin
 */
public class StudentImpl implements Student {
    private final Teacher teacher;

    private final Printer printer;

    private final int serial;

    public StudentImpl(Teacher teacher, Printer printer, int serial) {
        this.teacher = teacher;
        this.printer = printer;
        this.serial = serial;
    }

    private boolean isFizz() {
        final var fizz = teacher.getFizz();
        return this.serial % fizz == 0 || MathUtils.contains(this.serial, fizz);
    }

    private boolean isBuzz() {
        final var buzz = teacher.getBuzz();
        return this.serial % buzz == 0 || MathUtils.contains(this.serial, buzz);
    }

    private boolean isFizzBuzz() {
        return this.serial % teacher.getFizz() == 0 && this.serial % teacher.getBuzz() == 0;
    }

    public void say() {
        String word;
        if(isFizzBuzz()) {
            word = "fizzbuzz";
        } else if(isFizz()) {
            word = "fizz";
        } else if(isBuzz()) {
            word = "buzz";
        } else {
            word = String.valueOf(this.serial);
        }

        this.printer.print(word);
    }
}
