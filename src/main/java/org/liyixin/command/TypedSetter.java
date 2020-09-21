package org.liyixin.command;

import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

/**
 * @author Liyixin
 */
public interface TypedSetter {

    void set(String arg, MethodHandle handle);

    default Consumer<String> bind(MethodHandle handle) {
        return arg -> set(arg, handle);
    }

    static boolean parseBoolean(String arg) {
        if("true".equals(arg) || arg.isEmpty()) {
            return true;
        } else if("false".equals(arg)) {
            return false;
        } else {
            throw new IllegalArgumentException(arg + " is illegal.");
        }
    }
}
