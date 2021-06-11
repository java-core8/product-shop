package ru.tcreator.shop.buckets;

import ru.tcreator.filtering.Filter;
import ru.tcreator.idData.Id;
import ru.tcreator.printer.Printable;
import ru.tcreator.shop.products.Products;
import ru.tcreator.shop.products.ProductsImpl;

import java.util.Map;

public class BucketPrinter extends Bucket implements Printable {
    public BucketPrinter() {}

    @Override
    public void print(Filter<String> filter) {
        Map<Id, Products> prodList = super.productsList;
        StringBuilder builder = new StringBuilder("Содержимое корзины: ").append("\n");
        for (Map.Entry<Id, Products> tmp: prodList.entrySet()) {
            ProductsImpl prodTmp = (ProductsImpl) tmp.getValue();
            String nameProd = prodTmp.getName();
            String typeProd = prodTmp.getType();
            if(filter.filter(nameProd + " " + typeProd)) {
                String formatStringItem = String.format("id: %s, name: %s, price: %f",
                        prodTmp.getId(),
                        nameProd + " " + typeProd,
                        prodTmp.getPrice());
                builder.append(formatStringItem).append("\n");
            }
        }
        System.out.println(builder);
    }
}
