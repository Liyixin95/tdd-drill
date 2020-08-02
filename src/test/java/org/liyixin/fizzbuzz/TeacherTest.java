package org.liyixin.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TeacherTest {

    @Test
    public void equalFizzBuzz() {
        assertThrows(IllegalArgumentException.class, () -> new Teacher(3, 3));
    }

    @Test
    public void zeroFizzBuzz() {
        assertThrows(IllegalArgumentException.class, () -> new Teacher(0, 3));
        assertThrows(IllegalArgumentException.class, () -> new Teacher(3, 0));
    }

    @Test
    public void normalFizzBuzz() {
        Teacher teacher = new Teacher(3, 5);
        assertEquals(3, teacher.getFizz());
        assertEquals(5, teacher.getBuzz());
    }
}