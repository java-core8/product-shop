package ru.tcreator.idData;

public class Id implements Identificator, Comparable<Identificator>{
    private final Long id;

    public Id(Long id) {
        this.id = id;
    }

    @Override
    public int compareTo(Identificator o) {
        return id == o.getId() ? 0 : -1;
    }

    @Override
    public long getId() {
        return id;
    }

}
