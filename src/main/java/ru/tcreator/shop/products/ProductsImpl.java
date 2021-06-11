package ru.tcreator.shop.products;

import ru.tcreator.idData.Id;
import ru.tcreator.shop.products.builder.ProductsBuilder;

public class ProductsImpl implements Products, Comparable<ProductsImpl> {
    @Override
    public int compareTo(ProductsImpl products) {
        return id.compareTo(products.getId());
    }

    protected String name;
    protected String type;
    protected String condition;
    protected double weight;
    protected int count;
    protected String provider;
    protected double price;
    protected Id id;
    protected String group;

    public ProductsImpl(Id id, String name, int count, String type,
                        double price, String group) {
        this.name = name;
        this.count = count;
        this.type = type;
        this.price = price;
        this.id = id;
        this.group = group;
    }

    public ProductsImpl(Id id, String name, int count, String type, String condition,
                        double price, String group) {
        this.name = name;
        this.count = count;
        this.type= type;
        this.condition = condition;
        this.price = price;
        this.id = id;
        this.group = group;
    }

    public ProductsImpl(Id id, String name, int count, String type, String condition,
                        double weight, double price, String group) {
        this.name = name;
        this.count = count;
        this.type= type;
        this.condition = condition;
        this.weight = weight;
        this.price = price;
        this.id = id;
        this.group = group;
    }

    public ProductsImpl(Id id, String name, int count, String type, String condition,
                        double weight, String provider, double price, String group) {
        this.name = name;
        this.count = count;
        this.type = type;
        this.condition = condition;
        this.weight = weight;
        this.provider = provider;
        this.price = price;
        this.id = id;
        this.group = group;
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

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getGroup() {
        return group;
    }

    /**
     * Снять количество продукта
     * @param quantity
     * @return
     */
    protected boolean takeCount(int quantity) {

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

    @Override
    public String toString() {
        return "ProductsImpl {" +
                "товар ='" + name + type + '\'' + ". остаток = " + count +
                '}';
    }

    /**
     * Возвращеает предзаполненный билдер продукта {@ProductsImpl}
     * предзаполненные поля: type, price, name, id
     * @return {@ProductsBuilder}
     */
    public ProductsBuilder getProductChildBuilder() {
        return new ProductsBuilder()
                .setName(name)
                .setPrice(price)
                .setType(type)
                .setId(id)
                .setWeight(weight)
                .setProvider(provider)
                .setGroup(group);
    }
}
