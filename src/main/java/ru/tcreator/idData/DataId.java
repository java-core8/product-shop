package ru.tcreator.idData;

import java.util.Set;

public class DataId {
    protected Set<Id> randomSpace;
    protected static DataId data;

    private DataId() {}

    public static DataId getInstance() {
        if(data == null) {
            data = new DataId();
        }
        return data;
    }


    /**
     * Проверяет наличие номера в списке
     * @param id {@Long}
     * @return true если id есть в списке
     */
    public boolean contains(Id id) {
        return randomSpace.contains(id);
    }


    /**
     * Добавляет новый уникальный номер в список
     * @param id {@Link}
     * @return true если добавлено успешно
     */
    public boolean add(Id id) {
        return randomSpace.add(id);
    }

}
