package org.liyixin.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentImplTest {

    private final  Teacher teacher = new Teacher(3, 5);

    @Test
    public void testIsFizz() {
        final Printer assertPrinter = s -> assertEquals("fizz", s);

        Student student = new StudentImpl(teacher, assertPrinter, 3);
        student.say();

        student = new StudentImpl(teacher, assertPrinter, 31);
        student.say();
    }

    @Test
    public void testIsBuzz() {
        final Printer assertPrinter = s -> assertEquals("buzz", s);

        Student student = new StudentImpl(teacher, assertPrinter, 5);
        student.say();

        student = new StudentImpl(teacher, assertPrinter, 52);
        student.say();
    }

    @Test
    public void testIsFizzBuzz() {
        final Printer assertPrinter = s -> assertEquals("fizzbuzz", s);

        Student student = new StudentImpl(teacher, assertPrinter, 15);
        student.say();
    }

    @Test
    public void testNormal() {
        Student student = new StudentImpl(teacher, s -> assertEquals("16", s), 16);
        student.say();
    }
}