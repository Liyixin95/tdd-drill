package org.liyixin.command;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.invoke.MethodHandle;

/**
 * @author Liyixin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Parameter {

    String value();

    Setter setter();

    enum Setter implements TypedSetter {
        STRING_SETTER {
            @Override
            public void set(String arg, MethodHandle handle) {
                try {
                    handle.invokeExact(arg);
                } catch (Throwable throwable) {
                    throw new IllegalArgumentException(arg + " is illegal.");
                }
            }
        },
        INTEGER_SETTER {
            @Override
            public void set(String arg, MethodHandle handle) {
                try {
                    handle.invokeExact(Integer.parseInt(arg));
                } catch (Throwable throwable) {
                    throw new IllegalArgumentException(arg + " is illegal.");
                }
            }
        },
        BOOLEAN_SETTER {
            @Override
            public void set(String arg, MethodHandle handle) {
                try {
                    handle.invokeExact(TypedSetter.parseBoolean(arg));
                } catch (Throwable throwable) {
                    throw new IllegalArgumentException(arg + " is illegal.");
                }
            }
        }

    }
}
