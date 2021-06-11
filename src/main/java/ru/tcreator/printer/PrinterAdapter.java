package ru.tcreator.printer;

import ru.tcreator.filtering.Filter;

/**
 * Класс адаптер для принтеров сущностей.
 */
public class PrinterAdapter {
    protected Printable printEntity;
    protected Filter<String> filter;

    public PrinterAdapter() {}

    public PrinterAdapter setPrintEntity(Printable printEntity) {
        this.printEntity = printEntity;
        return this;
    }

    public PrinterAdapter setFilter(Filter<String> filter) {
        this.filter = filter;
        return this;
    }

    public void print() {
        printEntity.print((Filter<String>) filter);
    }
}
