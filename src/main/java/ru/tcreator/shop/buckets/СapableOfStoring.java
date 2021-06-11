package ru.tcreator.shop.buckets;

import ru.tcreator.shop.products.Products;

public interface СapableOfStoring {
    boolean addIntoBucket(Products product);
    boolean removeProduct(Products product);
}
