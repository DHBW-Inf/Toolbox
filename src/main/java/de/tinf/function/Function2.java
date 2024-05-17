package de.tinf.function;

@FunctionalInterface
public interface Function2 <First, Second, Return> {
    public Return apply(First first, Second second);
}
