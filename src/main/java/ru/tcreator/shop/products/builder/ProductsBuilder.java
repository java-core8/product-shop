package ru.tcreator.shop.products.builder;
import ru.tcreator.idData.Id;
import ru.tcreator.shop.products.ProductsImpl;

public class ProductsBuilder {
    protected String name;
    protected String type;
    protected String condition;
    protected double weight;
    protected int count;
    protected String provider;
    protected double price;
    protected Id id;
    protected String group;

    public ProductsBuilder() {
        this.weight = -1;
        this.count = -1;
        this.price = -1;
    }

    public ProductsBuilder setPrice(double price) {
        if(weight < 0) {
            throw new ArithmeticException("Вес товаров не может быть меньше ноля");
        }
        this.price = price;
        return this;
    }

    public ProductsBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    public ProductsBuilder setId(Id id) {
        this.id = id;
        return this;
    }

    public ProductsBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductsBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ProductsBuilder setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public ProductsBuilder setWeight(double weight) {
        if(weight < 0) {
            throw new ArithmeticException("Вес товаров не может быть меньше ноля");
        }
        this.weight = weight;
        return this;
    }

    public ProductsBuilder setCount(int count) {
        if(count < 0) {
            throw new ArithmeticException("Количество товаров не может быть меньше ноля");
        }
        this.count = count;
        return this;
    }

    public ProductsBuilder setProvider(String provider) {
        this.provider = provider;
        return this;
    }

    public ProductsImpl build() throws Exception{
        if(name != null && count != -1 && type != null && price != -1 && id != null && group != null) {
            if(condition != null) {
                if (weight != -1) {
                    if(provider != null) {
                        return new ProductsImpl(id, name, count, type, condition, weight, condition, price, group);
                    }
                    return new ProductsImpl(id, name, count, type, condition, weight, price, group);
                }
                return new ProductsImpl(id, name, count, type, condition, price, group);
            }
            return new ProductsImpl(id, name, count, type, price, group);
        } else {
            throw new Exception("Недостаточно данных для создания объекта");
        }
    }
}
