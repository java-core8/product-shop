package ru.tcreator.shop.buckets;

import ru.tcreator.idData.Id;
import ru.tcreator.shop.products.Products;
import ru.tcreator.shop.products.ProductsImpl;

import java.util.HashMap;
import java.util.Map;

public class Bucket implements СapableOfStoring, EmptyingTheBucket, PickUpTheItem {
    protected Map<Id, Products> productsList;

    public Bucket() {
        this.productsList = new HashMap<>();
    }

    @Override
    public boolean addIntoBucket(Products product) {
        ProductsImpl item = (ProductsImpl) product;
        productsList.put(item.getId(), product);
        return false;
    }

    @Override
    public boolean removeProduct(Products product) {
        ProductsImpl item = (ProductsImpl) product;
        Id prodId = item.getId();
        if(productsList.containsKey(prodId)) {
            productsList.remove(prodId);
            return Boolean.TRUE;
        }
        /* log */
        return Boolean.FALSE;
    }

    @Override
    public void empty() {
        productsList.clear();
    }

    @Override
    public void pickUpItem() {

    }
}
