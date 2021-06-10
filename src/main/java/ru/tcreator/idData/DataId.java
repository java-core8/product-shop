package ru.tcreator.idData;

import java.util.Set;

public class DataId {
    protected Set<Long> randomSpace;
    protected static DataId data;

    private DataId() {}

    public static DataId getInstance() {
        if(data == null) {
            data = new DataId();
        }
        return data;
    }

    public boolean contains(Long id) {
        return randomSpace.contains(id);
    }

    public boolean add(Long id) {
        return randomSpace.add(id);
    }

}
