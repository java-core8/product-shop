package ru.tcreator.shop.backets;

import ru.tcreator.shop.products.Products;

public interface СapableOfStoring {
    boolean addIntoBucket(Products product);
    boolean removeProduct(Products product);
}
