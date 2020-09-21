package org.liyixin.command;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TypedSetterTest {

    @Test
    void parseBooleanTest() {
        Assertions.assertTrue(TypedSetter.parseBoolean("true"));
        Assertions.assertTrue(TypedSetter.parseBoolean(""));
        Assertions.assertFalse(TypedSetter.parseBoolean("false"));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> TypedSetter.parseBoolean("fals"));
    }
}