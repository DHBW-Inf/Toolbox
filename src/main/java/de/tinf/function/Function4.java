package de.tinf.function;

@FunctionalInterface
public interface Function4 <First, Second, Third, Fourth, Return> {
    public Return apply(First first, Second second, Third third, Fourth fourth);
}
