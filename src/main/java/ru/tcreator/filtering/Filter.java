package ru.tcreator.filtering;

@FunctionalInterface
public interface Filter<T> {

    /**
     * Функциональный интерфейс для фильтрации
     * @param pattern
     * @return
     */
    boolean filter(T pattern);
}
