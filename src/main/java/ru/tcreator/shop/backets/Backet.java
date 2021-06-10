package ru.tcreator.shop.backets;

import ru.tcreator.shop.products.Products;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Backet implements СapableOfStoring, Iterable<Products> {
    protected List<Products> productsList;

    public Backet() {
        this.productsList = new ArrayList<>();
    }

    @Override
    public boolean addIntoBucket(Products product) {
        return false;
    }

    @Override
    public boolean removeProduct(Products product) {
        return false;
    }

    @Override
    public Iterator<Products> iterator() {
        return new Iterator<Products>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Products next() {
                return null;
            }
        };
    }
}
