package ru.tcreator.shop.products;

import ru.tcreator.idData.Id;
import ru.tcreator.idData.Randomizer;

public class ProductsImpl implements Products, Comparable<ProductsImpl> {
    protected String name;

    @Override
    public int compareTo(ProductsImpl products) {
        return id.compareTo(products.getId());
    }

    protected String type;
    protected String condition;
    protected double weight;
    protected int count;
    protected String provider;
    protected double price;
    protected Id id;

    public ProductsImpl(String name, int count, String type, double price) {
        this.name = name;
        this.count = count;
        this.type = type;
        this.price = price;
        createId();
    }

    public ProductsImpl(String name, int count, String type, String condition, double price) {
        this.name = name;
        this.count = count;
        this.type= type;
        this.condition = condition;
        this.price = price;
        createId();
    }

    public ProductsImpl(String name, int count, String type, String condition, double weight, double price) {
        this.name = name;
        this.count = count;
        this.type= type;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
        createId();
    }

    public ProductsImpl(String name, int count, String type, String condition, double weight, String provider, double price) {
        this.name = name;
        this.count = count;
        this.type= type;
        this.condition = condition;
        this.weight = weight;
        this.provider = provider;
        this.price = price;
        createId();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCondition() {
        return condition;
    }

    public double getWeight() {
        return weight;
    }

    public boolean takeCount(int quantity) {
        if(quantity > count) {
           return false;
        } else {
            count -= quantity;
            return true;
        }
    }

    public String getProvider() {
        return provider;
    }

    public Id getId() {
        return id;
    }

    protected void createId() {
        this.id = new Id(Randomizer.getRandomId());
    }

    @Override
    public String toString() {
        return "ProductsImpl {" +
                "товар ='" + name + type + '\'' + ". остаток = " + count +
                '}';
    }
}
