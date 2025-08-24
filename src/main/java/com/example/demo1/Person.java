package com.example.demo1;

import javafx.beans.property.*;

public class Person {
    private final StringProperty name = new SimpleStringProperty();
    private final IntegerProperty age = new SimpleIntegerProperty();

    public Person(String name, int age) {
        this.name.set(name);
        this.age.set(age);
    }

    public StringProperty nameProperty() { return name; }
    public IntegerProperty ageProperty() { return age; }
}
