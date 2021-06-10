package ru.tcreator.idData;
import java.util.Random;

/**
 * Класс выдачи уникальных идентификаторов
 */
public class Randomizer {

    /**
     * Создаёт уникальное случайное число типа {@Id} и добавляет его в список уникальных идентификаторов {@DataId}
     * @return {@Id}уникальный номер
     */
    public static Id getRandomId() {
        DataId data = DataId.getInstance();
        Id rand = new Id(new Random().nextLong());
        while(true) {
            if(data.contains(rand)) {
                rand = new Id(new Random().nextLong());
            } else {
                data.add(rand);
                break;
            }
        }
        return rand;
    }
}
