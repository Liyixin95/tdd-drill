package org.liyixin.fizzbuzz;

/**
 * @author Liyixin
 */
public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(3, 5);
        Printer printer = new SystemPrinter();
        for (int i = 0; i < 100; i++) {
            Student student = new StudentImpl(teacher, printer, i);
            student.say();
        }
    }
}
