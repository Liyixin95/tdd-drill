package org.liyixin.command;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author Liyixin
 */
public class Parser<T extends LookupAble> {

    private final T command;
    private Map<String, Consumer<String>> setters;

    public Parser(T command) {
        this.command = command;
        constructSetter();
    }

    private void constructSetter() {
        try {
            final Class<? extends LookupAble> commandClass = command.getClass();
            final var fields = commandClass.getFields();
            this.setters = new HashMap<>(((int) (fields.length * 1.5)));
            final var lookup = command.getLookup();
            for (Field field : fields) {
                final var annotation = field.getAnnotation(Parameter.class);
                if(annotation != null) {
                    final var setter = lookup.findSetter(commandClass, field.getName(), field.getType());
                    setters.put(annotation.value(), annotation.setter().bind(setter));
                }
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public T getCommand() {
        return command;
    }

    public void parse(String arg) {
        final var words = arg.split(" ");
        for (String word : words) {

        }
    }



}
