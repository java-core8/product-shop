package ru.tcreator.shop;

import ru.tcreator.idData.Id;
import ru.tcreator.shop.products.Products;

import java.util.Map;

/**
 * Класс для хранения всех товаров в магазине
 */

public class ProductsStorage {
    protected static ProductsStorage storage;
    protected Map<Id, Products> dataStorage;

    private ProductsStorage() {}

    /**
     * Возвращает инстанс ProductsStorage
     * @return
     */
    public static ProductsStorage getInstance() {
        if(storage == null) {
            storage = new ProductsStorage();
        }
        return storage;
    }

    /**
     * Возвращает продукт {@Products} по идентификатору {@Id}
     * @param prodId {@Id}
     * @return {@Products}
     * @throws {@ArrayIndexOutOfBoundsException} если нет товара по индексу
     */
    public Products getPosition(Id prodId) {
        if(!dataStorage.containsKey(prodId)) {
            throw new ArrayIndexOutOfBoundsException("Продукт с индекосм " + prodId + "не найден");
        }
        return dataStorage.get(prodId);
    }
}
