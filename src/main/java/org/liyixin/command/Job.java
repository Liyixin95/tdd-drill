package org.liyixin.command;

import java.lang.invoke.MethodHandles;

/**
 * @author Liyixin
 */
public class Job implements LookupAble{

    @Parameter(value = "-l", setter = Parameter.Setter.BOOLEAN_SETTER)
    private boolean log;

    @Parameter(value = "-p", setter = Parameter.Setter.INTEGER_SETTER)
    private int port;

    @Parameter(value = "-d", setter = Parameter.Setter.STRING_SETTER)
    private String path;

    private static final MethodHandles.Lookup lookup = MethodHandles.lookup();

    public boolean isLog() {
        return log;
    }

    public int getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    @Override
    public MethodHandles.Lookup getLookup() {
        return lookup;
    }
}
