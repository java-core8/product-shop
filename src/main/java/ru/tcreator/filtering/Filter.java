package ru.tcreator.filtering;

@FunctionalInterface
public interface Filter<T> {
    boolean filter(T pattern);
}
