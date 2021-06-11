package ru.tcreator.shop;
import ru.tcreator.filtering.Filter;
import ru.tcreator.idData.Id;
import ru.tcreator.printer.Printable;
import ru.tcreator.shop.products.Products;
import ru.tcreator.shop.products.ProductsImpl;

import java.util.Map;

public class ProductStoragePrinter implements Printable {
    public ProductStoragePrinter() {}

    @Override
    public void print(Filter<String> filter) {
        /**
         * Todo увеличить диапазон фильтрации
         */
        ProductsStorage productsStorage = ProductsStorage.getInstance();

        StringBuilder builder = new StringBuilder("Товары магазина: ").append("\n");
        for (Map.Entry<Id, Products> tmp: productsStorage.dataStorage.entrySet()) {
            ProductsImpl prodTmp = (ProductsImpl) tmp.getValue();
            String nameProd = prodTmp.getName();
            String typeProd = prodTmp.getType();

            //TODO filtering/ Добавить больше вариаций для фильтрации не только по имени
            // Разобраться как фильтровать сразу несколько
            // Пока что есть фильтрация только по группам

            if(filter.filter(prodTmp.getGroup())) {
                String formatStringItem = String.format("id: %s, name: %s, price: %f, ",
                        prodTmp.getId(),
                        nameProd + " " + typeProd,
                        prodTmp.getPrice());
                builder.append(formatStringItem).append("\n");
            }
        }
        System.out.println(builder);

    }
}
