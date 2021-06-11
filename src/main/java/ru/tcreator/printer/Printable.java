package ru.tcreator.printer;

import ru.tcreator.filtering.Filter;

public interface Printable {
    void print(Filter<String> msg);
}
