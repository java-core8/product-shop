package ru.tcreator.idData;
import java.util.Random;

/**
 * Класс выдачи уникальных идентификаторов
 */
public class Randomizer {

    /**
     * Создаёт уникальное случайное число типа {@Long} и добавляет его в список уникальных идентификаторов {@DataId}
     * @return
     */
    public static Long getRandomId() {
        DataId data = DataId.getInstance();
        long rand = new Random().nextLong();
        while(true) {
            if(data.contains(rand)) {
                rand = new Random().nextLong();
            } else {
                data.add(rand);
                break;
            }
        }
        return rand;
    }
}
