package de.tinf.function;

@FunctionalInterface
public interface Function3 <First, Second, Third, Return> {
    public Return apply(First first, Second second, Third third);
}