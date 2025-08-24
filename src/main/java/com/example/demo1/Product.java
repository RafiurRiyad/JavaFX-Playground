package com.example.demo1;

import javafx.beans.property.*;

public class Product {
    private final StringProperty name = new SimpleStringProperty();
    private final DoubleProperty price = new SimpleDoubleProperty();
    private final StringProperty category = new SimpleStringProperty();

    public Product(String name, double price, String category) {
        this.name.set(name);
        this.price.set(price);
        this.category.set(category);
    }

    // Getters
    public String getCategory() { return category.get(); }

    // Properties for TableView
    public StringProperty nameProperty() { return name; }
    public DoubleProperty priceProperty() { return price; }
    public StringProperty categoryProperty() { return category; }
}
